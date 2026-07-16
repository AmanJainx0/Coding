from pathlib import Path
import re

# Change this if your src folder is elsewhere
SRC = Path(__file__).parent / "src"

package_pattern = re.compile(r'^\s*package\s+[\w.]+\s*;\s*', re.MULTILINE)

for java_file in SRC.rglob("*.java"):
    rel = java_file.relative_to(SRC)

    if len(rel.parts) < 2:
        continue

    package = ".".join(rel.parts[:-1])

    content = java_file.read_text(encoding="utf-8")

    # Remove every existing package declaration
    content = package_pattern.sub("", content, count=1)

    # Remove leading blank lines
    content = content.lstrip()

    # Add correct package declaration
    content = f"package {package};\n\n{content}"

    java_file.write_text(content, encoding="utf-8")

    print(f"Fixed {java_file}")
