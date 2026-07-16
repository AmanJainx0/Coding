from pathlib import Path

SRC = Path(__file__).parent / "src"

for java_file in SRC.rglob("*.java"):
    rel = java_file.relative_to(SRC)

    # package = folder structure
    if len(rel.parts) > 1:
        package = ".".join(rel.parts[:-1])
    else:
        continue

    content = java_file.read_text(encoding="utf-8")

    # Skip if package already exists
    if content.lstrip().startswith("package "):
        continue

    new_content = f"package {package};\n\n" + content
    java_file.write_text(new_content, encoding="utf-8")

    print(f"Updated: {java_file}")
