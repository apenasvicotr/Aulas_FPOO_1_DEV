package classes.atividades;

/**
 *
 * @author Aluno
 */
public class Objetos {
    public static void main(String[] args) {
        //Salas
        Sala sala01 = new Sala(30, 30, 01, true, 30);
        sala01.abrirSala();
        System.out.println(sala01);
        
        Sala sala02 = new Sala(45, 45, 02, true, 45);
        sala02.fecharSala();
        System.out.println(sala02);
        
        Sala sala03 = new Sala(10, 10, 03, false, 1);
        sala03.abrirSala();
        System.out.println(sala03);
        System.out.println("");
        
        //Computadores
        Computador computador01 = new Computador(MemoriaEnum.OITO_GIGA, ProcessadorEnum.AMD_RYZENSETE, 500, "Windows10");
        computador01.ligarComputador();
        System.out.println(computador01);
        
        Computador computador02 = new Computador(MemoriaEnum.DEZESEIS_GIGA, ProcessadorEnum.INTEL_INOVE, 1000, "Linux Mint");
        computador01.desligarComputador();
        System.out.println(computador02);
        
        Computador computador03 = new Computador(MemoriaEnum.QUATRO_GIGA, ProcessadorEnum.INTEL_I5, 256, "MAC");
        computador03.ligarComputador();
        System.out.println(computador03);
        System.out.println("");
        
        //Cursos
        Curso dev = new Curso("Desenvolvimento de sistemas",
                "Curso profissionalizante de desenvolvimento de sistemas oferecido pela rede SENAI", CategoriaEnum.TI);
        dev.trancarCurso();
        System.out.println(dev);
        
        Curso adm = new Curso("Administração", "Curso profissionalizante de administracao oferecido pela rede SENAI", CategoriaEnum.ADMINISTRACAO);
        adm.seInscerver();
        System.out.println(adm);
        
        Curso solda = new Curso("Solda", "Curso profissionalizante de solda oferecido pela rede SENAI", CategoriaEnum.METALURGICA);
        solda.seInscerver();
        System.out.println(solda);
        
    }
  
}
