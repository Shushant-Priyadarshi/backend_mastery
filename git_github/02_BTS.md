# Behind The Scene

- Think of Git as a camera that takes a snapshot of your project every time you commit.
- Instead of saving entire files for every version, Git saves:
- A full snapshot of files that have changed.
- A reference (link) to unchanged files from the previous snapshot.
This makes Git efficient because it doesn’t duplicate unchanged data.

## Git Stores Data as Objects
- Internally, Git uses a content-addressable storage system:

    - Every piece of data (files, commits, trees) is stored as an object in Git’s database.
    - Each object is identified by a unique hash (SHA-1), which looks like this: e3b0c44298....
    - These objects include:
        - Blobs: Store the content of files.
        - Trees: Represent the directory structure.
        - Commits: Link to the tree of files and previous commits.

##  Commits Are Linked Together (DAG Structure)
   - Commits in Git form a directed acyclic graph (DAG).
- Each commit points to:
    -  A snapshot of your project (tree).
    -  The previous commit(s) (its parent).
- This structure allows Git to efficiently navigate the history of changes.



