# Treinamento Git




## Tecnologia

<img src="https://img.shields.io/badge/Git-330F63?style=for-the-badge&logo=gitlab&logoColor=white" alt="Git"/>









### (obrigatório)


- <a href="https://git-scm.com/downloads">Git 2.3+</a>




## O Que Ja Conhecia


##### Criar um novo repositório
```
git init

```

##### obtenha um repositório
```
git clone <caminhoRepositorio>
```

##### Adicionar Um Arquivo Especifico
```
git add <arquivo>

```

#####  Adicionar Tudo que a de novo no repositorio local

```
git add .
git add *

```

##### Confirmar as Alterações

```
git commit -m "comentários das alterações"

```

##### Enviar Alterações para repositorio remoto
```

git push -u origin <NomeDaBranch>

```
##### Criar uma nova branch e a selecionar
```
git checkout -b <NomeDaBranch>

```
#### Adicionar Tudo Confirmando As Alterações e Enviando Para Repositorio 

```
git add.
git commit -m "Nova Alteração Da Branch"
git push -u origin <NomeDaBranch>

```

##### Voltando Para Branch Principal

```
git checkout <main>

```



## Novidades


##### mesclar alterações

```
git merge <NomeDaBranch>

```

##### Confirmar Merge

```
git push -u origin main

```


##### Para pre visualizar alterações

```
git diff <BranchOrigem> <BranchDestino>

```


##### obter o id de commit 

```
git log

```

##### sobreescrever  alterações locais 


```
git checkout -- arquivo

```


##### remover todas as alterações e commits locais,
##### recupere o histórico mais recente do servidor e aponte para seu branch master local desta forma

```
 git fetch origin
 git reset --hard origin/main

```
##### excluir um repositorio

```
 rm -rf .git

```
##### remover uma pasta dentro do repositorio 

```
git rm -r NomeDaPasta

```
##### deletar uma branch remota 

```
git push origin --delete <NomeDaBranch>

```

#### Mostrar a diferenças entre arquivos


```
diff --git a/arquivo b/arquivo

```
##### Lista arquivos preparados, despreparados e que não foram monitorados.

```
git status

```


## References: 

  #### https://rogerdudler.github.io/git-guide/index.pt_BR.html
  #### https://git-scm.com/docs
  #### http://book.git-scm.com/

  
