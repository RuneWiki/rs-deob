package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kl")
public class class269 extends class248 {

    @ObfuscatedName("kl.az")
    public HashSet field2745;

    @ObfuscatedName("kl.ax")
    public HashSet field2746;

    @ObfuscatedName("kl.ac")
    public List field2747;

    @ObfuscatedName("kl.cx(Lvp;Lvp;IZI)V")
    public void method4612(class547 arg0, class547 arg1, int arg2, boolean arg3) {
        this.method4289(arg0, arg2);
        int var5 = arg1.method8899();
        this.field2745 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class243 var7 = new class243();
            try {
                var7.method4189(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2745.add(var7);
        }
        int var9 = arg1.method8899();
        this.field2746 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class251 var11 = new class251();
            try {
                var11.method4498(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2746.add(var11);
        }
        this.method4611(arg1, arg3);
    }

    @ObfuscatedName("kl.ca(Lvp;ZI)V")
    public void method4611(class547 arg0, boolean arg1) {
        this.field2747 = new LinkedList();
        int var3 = arg0.method8899();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8773();
            class348 var6 = new class348(arg0.method8734());
            boolean var7 = arg0.method8804() == 1;
            if (arg1 || !var7) {
                this.field2747.add(new class254((class348) null, var6, var5, (class261) null));
            }
        }
    }
}
