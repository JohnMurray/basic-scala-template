# Basic Scala Template

This is a template to help you get started writing Scala code quickly. This
was introduced on my blog-post [here][1]. You can read that to understand what
was added to this and why.

## Getting Started

First you'll need to setup the project locally. I like to do the following:

```shell
git clone git://github.com/JohnMurray/basic-scala-template.git $HOME/.basic-scala-template
echo 'alias scala-new="$HOME/.basic-scala-template/scala-new"' >>~/.bashrc
```

Of course you can put it wherever you'd like and source the `scala-new` script
however you'd like. This is just how I tend to set things up on my machines. From
here you're good to create your first template:

```shell
scala-new my-new-project
cd my-new-project/

./sbt
# have fun!
```

That's all there is to it.

## Contributing

If you think there is something that I am sorely missing from this project or
if you have an improvement that you'd like to make, please feel free to open an
issue or make a pull request. I'd love to pull in improvements if it makes peoples
lives easier when creating new Scala projects.

[List of Contributors][2]


  [1]: http://www.johnmurray.io/log/2014/04/15/Starting-a-Scala-Project.md
  [2]: https://github.com/JohnMurray/basic-scala-template/graphs/contributors
