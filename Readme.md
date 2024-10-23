# Text Editor Application

A simple Java-based Text Editor that allows users to open, edit, and save text files with basic functionality like word wrapping.

## Features
- **File Operations**:
  - Open text files and display content in the text editor.
  - Save current text to a file.
- **Text Wrapping**:
  - Enable or disable word wrapping within the editor.
- **Keyboard Shortcuts**:
  - `Ctrl+O` to open a file using the file chooser dialog.
  
## Components Used
- **JFrame**: Main application window.
- **JMenuBar**: Holds menus for File and Edit options.
- **JMenu**: Menu items for `File` and `Edit`.
- **JMenuItem**: Menu items for Open and Save operations.
- **JCheckBoxMenuItem**: Checkbox menu item for toggling word wrapping.
- **JTextArea**: Editable text area.
- **JScrollPane**: Scrollable container for the text area.

## How to Run

1. **Prerequisites**: 
   - Ensure you have Java Development Kit (JDK) version 8 or higher installed.

2. **Compilation**: 
   Open a terminal/command prompt, navigate to the directory containing the source code, and run:
   ```bash
   javac TextEditor.java
