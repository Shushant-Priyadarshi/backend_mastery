# Aspect Oriented Programming(AOP)

## Basics

- Aspect-Oriented Programming (AOP) is a programming paradigm that helps separate cross-cutting concerns (like logging,
  security, transaction management) from the main business logic.

- Instead of scattering duplicate code throughout your application (e.g., adding logging in every method), AOP allows
  you to define these concerns separately and apply them where needed.

## Key Concepts

| Term       | Description |
|------------|------------|
| **Aspect** | The module that contains cross-cutting concerns (e.g., logging, security). |
| **Advice** | The action taken by an aspect (e.g., before, after, around method execution). |
| **Pointcut** | A set of expressions defining where advice should be applied. |
| **Join Point** | A point during execution (e.g., method call) where an aspect can be applied. |
| **Weaving** | The process of applying aspects to target objects at runtime. |



