import java.sql.Time;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        Personagem personagem = new Personagem();
        Inimigos inimigos = new Inimigos();
        Vermeullen vermeullen = new Vermeullen();
        Jamuth ukorn = new Jamuth();


        System.out.println("==================================================================================================");
        System.out.println("" +
                "                              ██╗   ██╗██╗  ██╗ ██████╗ ██████╗ ███╗   ██╗\n" +
                "                              ██║   ██║██║ ██╔╝██╔═══██╗██╔══██╗████╗  ██║\n" +
                "                              ██║   ██║█████╔╝ ██║   ██║██████╔╝██╔██╗ ██║\n" +
                "                              ██║   ██║██╔═██╗ ██║   ██║██╔══██╗██║╚██╗██║\n" +
                "                              ╚██████╔╝██║  ██╗╚██████╔╝██║  ██║██║ ╚████║\n" +
                "                               ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝");
                System.out.println("                                                                                        \n" +
                "          (                                                                                         \n" +
                "         ((.                                                                            */          \n" +
                "        /##,                                                                            (((         \n" +
                "       (#(/(                                                                            /#(#        \n" +
                "      ,#####                                  *(                                        /#%%(       \n" +
                "      ####(#                                  (#,                                       ##%##.      \n" +
                "     .(%###(,                                .##/                                       /##(##      \n" +
                "     /#####(/                                (//(*                                     .((###(      \n" +
                "     *(###((#                                %#%#/                                     */(###(*     \n" +
                "     /######(                                %##%(.                                    (((##%#(     \n" +
                "     *###(##/                               .##(//%                                    %(((###(     \n" +
                "     *%####/*.                              /%%#,,(                                    /(###%##     \n" +
                "     /##((#/(*                              (%%#/(#                                    *(###%#/     \n" +
                "     ,##%###/(                              (%%#((#,                                   (((##%%#     \n" +
                "      (##%(##(                              (#%((/.(                                   (/(#%#%#     \n" +
                "      ((%####/                              (%%%#(/(                                  *(#(#%#(/     \n" +
                "      ,##%####,                            .((###/*(                                  #((##%%#(     \n" +
                "      .######(#                            /##%%#(*/%                                 ((#(#%%#(     \n" +
                "       (####((/                            *##%%%//,/                                 ((#//&%(*     \n" +
                "       /###(((/.                           (#%#%%/(#(.                                /#/#%%%#.     \n" +
                "       *%####(((                           *##%%%((#/%                               *##((%%#(      \n" +
                "        (%#%(/**                           (#%%%#/#/,/                               (((##%%%#      \n" +
                "        /####(/(,                          ##%%#(/(/*,                               #(##%%%%/      \n" +
                "        *#####(%(         *               ,%&%%%%/(//*%                              #(###%##.      \n" +
                "        .(%##(#(#         //              #&&%&&#/(%((*(                            ,###%####       \n" +
                "         /(#%(((((       .%*             &&&&&&&%((&&&%#%*                   /,     (#(((%###       \n" +
                "         ,#%#####(       .#,*           %%(#&&%&#//&%%%#(/#/                *(.     /#(((#%#/       \n" +
                "         .(%%##/(/       .//#         (&&%#*,/((#(((/*,.,/#&&&%             %(      (####%%(.       \n" +
                "          /#%%#####      .###,     &&%/&&%%%%%%##(#&&&&&&%%%#%/(&&@.       ,#(     *####%#%(        \n" +
                "          (#%%##%#&      .%(## .%&%.&&&#%(/**//(#((%%%(#/(/*(##%%%#%%&     (%/     %##%##&%(        \n" +
                "          *%######%      .##%#&&%%&&#%/*,******,#(#*/(*,**//*//*(%%&&#&&. (%%/     (%%%##%%*        \n" +
                "          .//%%#####     #(%#((&&&#%/*,,(&%%#(#####&&&%#%#%%%%/***(%%@%#%#%%%*    ,#&%%%#%%.        \n" +
                "           /%%##%(#%   .&%%#%%#&&%%(//%%####(##%##%%%#%#%#%##%##%**(#%%&#%%%%,    #*###%%%#         \n" +
                "           ,/##/#/%%% %%%%#%#%##%%#(%#%########%%%%((#########%%#&&//#%%&##%#/   (%%%%###%(         \n" +
                "           */%%#%#%%#######%%%%(%##&(%%#(####(##%#%,%(%#(###%%##%%#(((%%(#%%(%/ &#%%&%%###(         \n" +
                "            *#%%(*#%#%###(#%%%#(%#%%%%%##(%##/(/#%##(*##((##%%###%%%(%%#%%%%#%%&(%%#(##(##          \n" +
                "            ##%%%##(#####%##%#(#%#&(%%%##%%#%(/.%%%%(((((%##%%####%&###(##%%%#&##%((((###(          \n" +
                "            /####%%%#/###%###%#(/&%%%%#%#%%#%(#(%%%%**#(###%##%(#%#%%%%##%%(%%#%#%**%%#/%*          \n" +
                "            ,%%%%##%%%%%##%(%%%####%%%##%####%##%%%%(#(%#%%%%#%%%##%%#(#%%%(##%##((%#%#%**          \n" +
                "              .%%###%%##%%%((#####(#%##&&%%%#%%%&%&%%%%#%%%%###%%%#%//(######%%%%#%%%#%##           \n" +
                "                 ##%%%%#(&#(((#(%(#%##%#%&&%&&%&&&%%%(%%#%%%%%%#(#%/###(%#/#&%%%%%%%%%(%*           \n" +
                "                  %%#%%##%%##%####&%%%&&&#%#%%%%&%%&%%##%&%%###%%#####((##/%%%%%%###(               \n" +
                "                   %####%%%#/%%#(#%#%%%%&%&&&&%&%&%&&(%#%&&%%%%#&(%%#####(###%##%#%(                \n" +
                "                   (%###%#%#,((%(%%%##/%&%%%%##%%&%%&%%%%&&%%%%*%((####%#(#%#####%%                 \n" +
                "                    ####%%%##*/#%#%#%%%(%&%&%#%#%%%%%%%#&&#&%,(%(/*#%###%(%#(######                 \n" +
                "                    %#####(%%#(%#((((#(###%%%%%%%%%%%%%%&&%(%%##*#(%(/######(##%##,                 \n" +
                "                    %#%%####%%#%/#,.(%###(/%&%&%#%%%##&&%%%%%##(/#//##@(##((%%%#%(                  \n" +
                "                   *##%##%###%#(@(((/(%##%%(%&&##%%%#(&#((%%%##/(#(#%@#%%%##%#%#%#.                 \n" +
                "                    ((##%%%(##((%###/*#%#%#%(((((#%(*(%(#(%%%(####%(@%%#%%%#%#%#(%*                 \n" +
                "                       /#(#%##& ,%&@@/(((%%%##((((#%%&####%%%//#(&&@%%#%#%%%%%(#%%#                 \n" +
                "                        #(%%%##(.%%&@%@#*(%%#(/%/%&%%%##%###%(... &%(%/####(##(%#.                  \n" +
                "                         #%(%#(&(%(%@&..,*###&&%&&%%&*(%%%##,,.. @%#%(*(%((#####                    \n" +
                "                         ,(#((#&((*#@%@ ./#%#/@@&&&&&@@((#%#,.&&%%&%(/##@#%#%##,                    \n" +
                "                          &/#%#%%#*//&%##%%(#((@@%%@@@%#%(/%#&&&%%%#/##%####(#@                     \n" +
                "                          /##%#((*(((.@&%#%%%((&@%#&@@/%%%%#%&%&%##%#((@##&##@/                     \n" +
                "                           &###(/(.###&&%##%%%**./.&(,&##%%%##&%%%%(%%(/#%/%(,                      \n" +
                "                           ,/##/%%% .(#@&&%#%,...#(&/...#%%%#&@&%*%&%%(#%#*#,                       \n" +
                "                            (%@&#(%/#((@&%&&%,.. &.%  ..&%%#%&&&%(*%%(%(#%%/                        \n" +
                "                            ((&@(%%#*%./@%%&#,.. %*%  ..#%@&&@@%&#%%#(&(/((.                        \n" +
                "                            /(*%@*(% .#.&&%#(,.. %/%  ..(&%&&@@&##%#((&@&%&                         \n" +
                "                            ,/#,#@(/## .&%&%#&.  &/%  .,&&%&&&@(#%#%*&@&(&,                         \n" +
                "                             (#%%%@(/(#*%%&#%#*  %/%  .,(%&&%&&#%(/(#@@*#*.                         \n" +
                "                             ,%&%#&%#(/(&%#%#/%  ##%  .(&%%%#%&/@*(%&&#/%                           \n" +
                "                              /&%%#%%((((%#%#@(& #&# .,%&%%%%%&##(#%%%#(.                           \n" +
                "                               ((%*#%#(/(%%*###%,##%,*##%(%#%%%%(##%&/(#                            \n" +
                "                                .#%%%&/(,(%#(/((&((&%&###%(#%%&*(##&@##(                            \n" +
                "                                 ./#(%#/*/%#*(((%###%&%#%%%%%%&#(#%&@%#.                            \n" +
                "                                  *%%%##(#%#/*(%%#&(%&(%(((#%&&%%%%%@##.                            \n" +
                "                                  (&#%######(,(,%(*%%&#(#(#%%%&(%#%&&#%*                            \n" +
                "                                 ,%&(##(%%(##/#(#((%#%#%#/%#%%&/%%%%&&##                            \n" +
                "                                 /  .%##%#((#.*&%(%&&&&%#####%%&/#*,/&&%(                           \n" +
                "                                     ##&####/##%#/(#%#&%%#%%%%(#&%.                                 \n" +
                "                                     ,.,,,##/(##//*%%#&&#####//**,                                  \n" +
                "                                          ,(/(%#%#*%#%#&%%(#(,..                                    \n" +
                "                                           /((%%##,*%#%#%#(%,.                                      \n" +
                "                                           #*,%%(# #%(#%/&/#                                        \n" +
                "                                             ...##,%%##/**,.                                        \n" +
                "..  ..  . ..     .     .. ..  ..                ./#%(/*,.                                           \n" +
                "...................,..,.........                  #%   ");


                System.out.println("TORNEIO DE UKORN");

                System.out.println("-- ANO 1000 AC");

                System.out.println("SEJA BEM VINDO AO TORNEIO SANGRENTO DE UKORN");
                System.out.println("- Digitem SIM para entrar no torneio");

                String respostaUsuario = scan.nextLine();

                if(respostaUsuario.equals("Sim") || respostaUsuario.equals("sim") && respostaUsuario.length() > 0 ) {
                    System.out.println("\n \n -- ÓTIMO. AGORA BOA SORTE E PREENCHA OS CAMPOS ABAIXO");

                    System.out.println("\n \n Nome do guerreiro:");
                    personagem.nome = scan.nextLine();
                    System.out.println("\n \n Sexo:");
                    personagem.sexo = scan.nextLine();
                    System.out.println("\n \n Classe do guerreiro:");
                    personagem.classe = scan.nextLine();

                    System.out.println("==================================================");
                    System.out.println("====== ==  --** SUAS INFORMAÇÕES **--  ==  =======");
                    System.out.println("====== Nome do guerreiro: " + personagem.nome);
                    System.out.println("====== level: " + personagem.level);
                    System.out.println("====== Classs: " + personagem.classe);
                    System.out.println("====== Sexo: " + personagem.sexo);;
                    System.out.println("====== Força: " + personagem.forca);;
                    System.out.println("====== Defesa: " + personagem.defesa);;
                    System.out.println("====== Vida: " + personagem.hp);
                    System.out.println("==================================================");
                    System.out.println("==================================================");

                    
                    System.out.println("======= PRIMEIRO OPONENTE =========");
                    System.out.println("- - -      Luziavel        - - -");
                    System.out.println("- - -     *SE PREPARE*       - - -");
                    System.out.println("Aperte D para iniciar a jogada");
                    System.out.println("\n Aperte 'D' para iniciar a jogada!");
                    String respostaUsuario1 = scan.nextLine();

                    if(respostaUsuario1.equals("D") || respostaUsuario1.equals("d")) {

                        int jogadas = 1;

                        for(jogadas = jogadas; jogadas >= 0;) {
                            
                            Random dado = new Random();
                            int resultadoDado = dado.nextInt(20);    

                            System.out.println("Digite 'J' para jogar o DADO");
                            String respostaUsuario2 = scan.nextLine();
                            
                            if(respostaUsuario2.equals("j") || respostaUsuario2.equals("J")) {
                                
                            if(resultadoDado > 17) {

                                inimigos.hp -= personagem.forca + resultadoDado * 4; 
                                
                                System.out.println("============" + "Você atacou! !!!ATK CRITICO!!!!" + "=================");
                                System.out.println("Dano causado: " + (personagem.forca + resultadoDado * 4));
                                System.out.println("Seu HP:" + personagem.hp);
                                System.out.println("HP Luziavel:" + inimigos.hp);
                                System.out.println("============================================================================");
                                
                                if(inimigos.hp <= 0) {
                                    jogadas = -1;
                                }

                            } else if(resultadoDado >= 10) {

                                inimigos.hp -= personagem.forca + resultadoDado * 2; 
                                System.out.println("============" + "Você atacou!" + "=================");
                                System.out.println("Dano causado: " + (personagem.forca + resultadoDado * 2));
                                System.out.println("Seu HP:" + personagem.hp);
                                System.out.println("HP Luziavel:" + inimigos.hp);
                                System.out.println("=========================================================");
                                
                                if(inimigos.hp <= 0) {
                                    jogadas = -1;
                                }

    
                            } else if(resultadoDado < 10) {

                                personagem.hp -= inimigos.forca + resultadoDado;

                                System.out.println("============" + "Luziavel atacou!" + "=================");
                                System.out.println("Dano sofrido: " + (inimigos.forca + resultadoDado));
                                System.out.println("Seu HP:" + personagem.hp);
                                System.out.println("HP Luziavel:" + inimigos.hp);
                                System.out.println("==========================================================");
                                
                                if(personagem.hp <= 0) {
                                    System.out.println("Você perdeu o torneio :(");
                                    jogadas = -1;

                                    System.out.println("Aperte T para reiniciar o jogo nobre guerreiro.");
                                    String respo = scan.nextLine();

                                    if(respo.equals("T") || respo.equals("t")) {
                                        App.main(args);
                                    }

                                }
    
                            }
                            }
                        }

                        personagem.level = 2;
                        personagem.forca = 20;
                        personagem.hp = 150;

                        System.out.println("===== SUAS INFORMAÇÕES =====");
                        System.out.println("===== Level 1 >:" + personagem.level + "=====");
                        System.out.println("===== Forca 10> :" + personagem.forca + "=====");
                        System.out.println("===== Hp: 100 > " + personagem.hp + "=====");
                        
                        System.out.println("======= PRÓXIMO OPONENTE =========");
                        System.out.println("- - -      Vermeullen        - - -");
                        System.out.println("- - -     *SE PREPARE*       - - -");
                        System.out.println("Aperte D para iniciar a jogada");
                        String respoUser0 = scan.nextLine();

                            if(respoUser0.equals("D") || respoUser0.equals("d")) {

                                int jogada01 = 0;

                                for(jogada01 = jogada01; jogada01 >= 0;) {
                                
                                    Random dado = new Random();
                                    int resultadoDado = dado.nextInt(20);    
        
                                    System.out.println("Digite 'J' para jogar o DADO");
                                    String respostaUsuario2 = scan.nextLine();

                                    if(respostaUsuario2.equals("j") || respostaUsuario2.equals("J")) {

                                        if(resultadoDado > 17) {
        
                                            vermeullen.hp -= personagem.forca + resultadoDado * 4; 
                                            
                                            System.out.println("============" + "Você atacou! !!!ATK CRITICO!!!!" + "=================");
                                            System.out.println("Dano causado: " + (personagem.forca + resultadoDado * 4));
                                            System.out.println("Seu HP:" + personagem.hp);
                                            System.out.println("HP Vermeullen:" + vermeullen.hp);
                                            System.out.println("============================================================================");
                                            
                                            if(vermeullen.hp <= 0) {
                                                jogada01 = -1;
                                            }
            
                                        } else if(resultadoDado >= 10) {
            
                                            vermeullen.hp -= personagem.forca + resultadoDado * 2; 
                                            System.out.println("============" + "Você atacou!" + "=================");
                                            System.out.println("Dano causado: " + (personagem.forca + resultadoDado * 2));
                                            System.out.println("HP aliado:" + personagem.hp);
                                            System.out.println("HP Inimiga:" + vermeullen.hp);
                                            System.out.println("=================================================");
                                            
                                            if(vermeullen.hp <= 0) {
                                                jogada01 = -1;
                                            }
            
                
                                        } else if(resultadoDado < 10) {
            
                                            personagem.hp -= vermeullen.forca + resultadoDado;
            
                                            System.out.println("============" + "Vermeullen atacou!" + "=================");
                                            System.out.println("Dano sofrido: " + (vermeullen.forca + resultadoDado));
                                            System.out.println("HP aliado:" + personagem.hp);
                                            System.out.println("HP Inimiga:" + vermeullen.hp);
                                            System.out.println("==========================================================");
                                            
                                            if(personagem.hp <= 0) {
                                                System.out.println("Você perdeu o torneio :(");
                                                jogada01 = -1;
            
                                                System.out.println("Aperte T para reiniciar o jogo nobre guerreiro.");
                                                String respoUser1 = scan.nextLine();
            
                                                if(respoUser1.equals("T") || respoUser1.equals("t")) {
                                                    App.main(args);
                                                }
            
                                            }
                                        }
                                    }
                                }

                                
                                 personagem.level = 3;
                                 personagem.forca = 30;
                                 personagem.hp = 200;

                                 System.out.println("===== SUAS INFORMAÇÕES =====");
                                 System.out.println("===== Level 2 >:" + personagem.level + "=====");
                                 System.out.println("===== Forca 20> :" + personagem.forca + "=====");
                                 System.out.println("===== Hp: 150 > " + personagem.hp + "=====");
                                
                                System.out.println("======= VOCÊ CHEGOU NO CHEFAO ========.");
                                System.out.println("- - -  SEU OPONENTE SERÁ UKORN  - - -");
                                System.out.println("- - -       *SE PREPARE*     - - -");
                                System.out.println("Aperte D para iniciar a jogada");

                                String respouser3 = scan.nextLine();

                                if(respouser3.equals("D") || respouser3.equals("d")) {

                                    int jogada02 = 0;

                                    for(jogada02 = jogada02; jogada02 >= 0;) {
                                
                                        Random dado = new Random();
                                        int resultadoDado = dado.nextInt(20);    
            
                                        System.out.println("Digite 'J' para jogar o DADO");
                                        String respostaUsuario2 = scan.nextLine();
    
                                        if(respostaUsuario2.equals("j") || respostaUsuario2.equals("J")) {
    
                                            if(resultadoDado > 17) {
            
                                                ukorn.hp -= personagem.forca + resultadoDado * 4; 
                                                
                                                System.out.println("============" + "Você atacou! !!!ATK CRITICO!!!!" + "=================");
                                                System.out.println("Dano causado: " + (personagem.forca + resultadoDado * 4));
                                                System.out.println("HP aliado:" + personagem.hp);
                                                System.out.println("HP Inimiga:" + ukorn.hp);
                                                System.out.println("============================================================================");
                                                
                                                if(ukorn.hp <= 0) {
                                                    jogada02 = -1;
                                                }
                
                                            } else if(resultadoDado >= 10) {
                
                                                ukorn.hp -= personagem.forca + resultadoDado * 2; 
                                                System.out.println("============" + "Você atacou!" + "=================");
                                                System.out.println("Dano causado: " + (personagem.forca + resultadoDado * 2));
                                                System.out.println("HP aliado:" + personagem.hp);
                                                System.out.println("HP Inimiga:" + ukorn.hp);
                                                System.out.println("=================================================");
                                                
                                                if(ukorn.hp <= 0) {
                                                    jogada02 = -1;
                                                }
                
                    
                                            } else if(resultadoDado < 10) {
                
                                                personagem.hp -= ukorn.forca + resultadoDado;
                
                                                System.out.println("============" + "Ukorn atacou!" + "=================");
                                                System.out.println("Dano sofrido: " + (ukorn.forca + resultadoDado));
                                                System.out.println("HP aliado:" + personagem.hp);
                                                System.out.println("HP Inimiga:" + ukorn.hp);
                                                System.out.println("==========================================================");
                                                
                                                if(personagem.hp <= 0) {
                                                    System.out.println("Você perdeu o torneio :(");
                                                    jogadas = -1;
                
                                                    System.out.println("Aperte T para reiniciar o jogo nobre guerreiro.");
                                                    String respo = scan.nextLine();
                
                                                    if(respo.equals("T") || respo.equals("t")) {
                                                        App.main(args);
                                                    }
                
                                                }
                                            }
                                        }
                                    } 
   
                                   System.out.print("========= MEU PARABENS UKORN FOI DERROTADO ==================");
                                   System.out.println("======= e você venceu o torneio de UKORN! ===============");
                                   System.out.println("=========================================================");
                                   System.out.println("Aperte T para um novo jogo nobre guerreiro.");
                                                    String respo = scan.nextLine();
                
                                                    if(respo.equals("T") || respo.equals("t")) {
                                                        App.main(args);
                                                    }

                                }
                                
                            }

                            
                        
                    }
                        
 
                }

    };

}

