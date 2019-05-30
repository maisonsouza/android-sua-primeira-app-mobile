# Curso de Android Criando seu primeiro App Mobile
> Projeto de uma agenda de alunos.
* Funcionalidades: 
  * Cadastrar um aluno.
  * Listar aluno cadastrado.

## Pré- requisitos
* Orientação a Objetos.

### Aula 01 - Criando o primeiro App.
* Conteudo:
  * O que é o Android ?
  > Sistema operacional, Open source, Código aberto, baseado em Linux.
  * Onde o Android é usado ?
  > Smartphones e Tables(principais), Wears, Automóveis, Tv's, Notebooks, Iot.
  * Quais são as vantagens de desenvolver para Android ?
  > Grande alcance de usuários.(2 bilhoês de dispositivos ativos), recursos dos dispositivos(camêra, GPS, Sensores, Concectividade. 
  * O que eu preciso para desenvolvedor para Android ?
  > Conhecimentos sólidos em Programação Orientada a Objetos, Ferramenta de Desenvolvimento (Android Studio), Android SDK, Linguagem (Java/Kotlin/C++).
  > Dica: O Android Studio Funciona bem melhor com discos SSD e memória igual ou superior a 8Gb.
  * `Versão do Android Studio utilizada: 3.4.1 baseado no Intellij`
  * `Nome da Aplicação: Agenda`
  * `API Mínima: 21`
  > Procedimentos a serem executados em caso de problemas
  * Invalidando cache e reiniciando o Android Studio.
  * Limpar e recompilar o projeto
  * Sincronizar projeto com o Gradle.
  
  * O que é uma activity ?
  > São os pontos de entrada de um App. É composta de Views e Lógica.Geralmente é criado como MainAcitivity(Activity Principal).Precisamos herdar a classe Activity.
  
  * Registrar uma activity
  > Feito no arquivo de manifests, um arquivo xml, onde configuramos os componentes principais do aplicativo por meio de tags:
  ```
  <activity android:name=".MainActivity">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
  ```
  Essa configuração permite executar o aplicativo.
  
  * Como executar o aplicativo ?
  > Para executar o aplicativo podemos utilizar um AVD ou o próprio celular. A execução no celular é mais rápida. Ao utilizar o emulador evitar finalizar manter aberto pois a primeira inicialização é lenta.
  
  * Ciclo de vida do Android
  > OnCreate, onResume, onStop...
  
  * O que é um Toast ?
 > Serve para mostrar uma mensagem na tela, longa ou curta.(Não utilizar como debug).
  
### Aula 02 - Aplicando layouts para activities.
  * Criando layout de uma activity
  > Via arquivo Java (Mais complicado).
  > Via Arquivo estático. (Mais simples e com mais ferramentas), pasta resources(res).
    * Permite drag-and-drop
    * Editor personalozado com as propriedades das views.
  
  * Boas práticas de implementação no Android
  > Não colocar muitas responsabilidades dentro da activity (lógica e views).
  > Colocar bons nomes para as views
 
  > `Fazemos o vínculo do layout com o Java através do método findViewById()`
  * A Classe R faz o mapeamento dos recursos do layout para o Java.
  
  > Proposta de Implementação de Layout
  * Lista de Alunos
  * Botão para adicionar um novo aluno (FAB)

  
### Aula 03 - Entendendo a base de construção de layouts.
  > FloatingActionButton
  - Base para montar layouts no Android 
    - `Todos os componentes são views`
    - ``Ficam agrupadas dentro de uma ViewGroup - Container (LinearLayout, RelativeLayout)``
  * Ações dos botôes (listerners).
  * Layout via XML
  > Hierarquia com níveis de indentação, namespace na primeira view.
  > Diferenças entre PX E DP
  * atributo clickable e focusable (tab, acessibilidade).
  
### Aula 04 - Trabalhando com arquivo fonte de layout.
- Podemos adicionar arquivos para o layout na pasta drawable.
- Adicionamos uma AppBar através da herança de AppCompatActivity 
- Shift + F6 Renomear o projeto.
- Adicionando uma activity de formulario.

### Aula 05 - Finalizando o fluxo do App.
- setOnClicklistener para implementar a ação do botão após ser clicado.
- BindContructorParameterstoFiels (Pega s parametros e faz as devidas atribuiçõe sno contrutor)
- DAO (Design Pattern)
- Ciclo de Vida da Activity
- Cltrl + Alt + O (remover imports inutilizados)
- Refatoração no código
- Extract Method
- Alt + Shift + setapracima ou setaparabaixo para Mover código.
- Cltr + Alt + F (Cria atributos)
- Refatoração não deve alterar o comportamento da aplicação.





