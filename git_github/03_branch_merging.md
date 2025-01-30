# Branching And Merging

## Branch:

    - Branches are a way to work on different versions of a project at the same time. They allow you to create a separate line of development that can be worked on independently of the main branch.

    -  The HEAD is a pointer to the current branch that you are working on. It points to the latest commit in the current branch. When you create a new branch, it is automatically set as the HEAD of that branch.

```
        git branch
        git branch bug-fix
        git switch bug-fix
        git log
        git switch master
        git checkout orange-mode
        git checkout main
        git merge bug-fix
```


```
    //Rename a branch
    git branch -m master main

    //delete a branch
    git branch -d master

    //List all branches
    git branch

```
