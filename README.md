# mdd-example

(Example 2 from the MDD slide deck)

Requires Eclipse 2019-12 or later revision.

## The DSL

The ```dsl``` folder contains Xtext projects that define the NavigationRules DS:. 

You can import the projects in your Eclipse dev workspace using the File->Import->General->Existing Projects into Workspace.

## The Example

The ```example``` folder contains the example project with the MyApplication.navirules model (in src), and its generated MyApplicationRules.java (in src-gen) generated Java code.

With your langugate projects in your Eclipse dev workspace (previous step), you can launch a runtime workspace, where you can import this project using the File->Import->General->Existing Projects into Workspace.

Notice that any edit to the model will cause the Java code to be regenerate!
