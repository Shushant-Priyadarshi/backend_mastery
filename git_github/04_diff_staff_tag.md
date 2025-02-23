# Git Diff, Stash, and Tag

## Git Diff
- **`git diff`** is used to see the differences between changes in your working directory and the staging area, or between commits. It helps in tracking what changes have been made before committing them.

```sh

# Show unstaged changes (between working directory and staging area)
git diff

# Show changes between staged files and last commit
git diff --staged

# Show changes between two commits
git diff commit1 commit2

# Show changes in a specific file
git diff filename

# Show changes for a specific branch
git diff branch-name

# Show changes between two branches
git diff branch1 branch2
```

## Git Stash

- **`git stash`** is used to temporarily save changes that are not ready to be committed, allowing you to clean your working directory while keeping the progress intact. This is particularly useful when switching tasks or branches.

```sh
# Save current changes to stash
git stash

# Save with a message
git stash save "WIP: fixing bug"

# List all stashes
git stash list

# Apply the latest stashed changes and keep them in the stash
git stash apply

# Apply and remove the latest stash
git stash pop

# Apply a specific stash
git stash apply stash@{1}

# Drop (delete) a specific stash
git stash drop stash@{0}

# Clear all stashes
git stash clear
```


## Git Tag
- **`git tag`** is used to mark specific points in a Git repository's history. It is commonly used to mark release points like version numbers.
- Tags in Git are like bookmarks in the history of a repository. They are used to mark specific commits as important, usually marking releases or milestones.
- Types of Tags

    - Lightweight tags: A simple pointer to a commit (like a branch that doesn't change)
    - Annotated tags: These are stored as full objects with metadata such as the tagger's name, email, date, and an optional message (often used for releases)

```sh
# List all tags
git tag

# Create a lightweight tag
git tag v1.0

# Create an annotated tag
git tag -a v1.0 -m "Version 1.0 release"

# View details of a tag
git show v1.0

# Push tags to the remote repository
git push origin v1.0

# Push all tags to the remote repository
git push --tags

# Delete a local tag
git tag -d v1.0

# Delete a remote tag
git push origin --delete v1.0

# Checkout a specific tag (detached HEAD state)
git checkout v1.0

# Create a branch from a tag
git checkout -b new-branch v1.0
```