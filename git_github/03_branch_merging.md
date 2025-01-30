# Branching and Merging

## Branch

- Branches are a way to work on different versions of a project at the same time. They allow you to create a separate line of development that can be worked on independently of the main branch.

- The **HEAD** is a pointer to the current branch that you are working on. It points to the latest commit in the current branch. When you create a new branch, it is automatically set as the HEAD of that branch.

### Common Git Branch Commands

```sh
# List all branches
git branch

# Create a new branch
git branch bug-fix

# Switch to a branch
git switch bug-fix

# View commit history
git log

# Switch back to the master branch
git switch master

# Checkout an existing branch
git checkout orange-mode
git checkout main

# Merge a branch into the current branch
git merge bug-fix


# Rename a branch
git branch -m master main

# Delete a branch
git branch -d master

# List all branches
git branch
