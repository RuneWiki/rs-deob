package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kk")
public class class270 extends class249 {

    @ObfuscatedName("kk.ax")
    public HashSet field3061;

    @ObfuscatedName("kk.ai")
    public HashSet field3063;

    @ObfuscatedName("kk.ag")
    public List field3060;

    @ObfuscatedName("kk.cl(Lsg;Lsg;IZB)V")
    public void method5022(class489 arg0, class489 arg1, int arg2, boolean arg3) {
        this.method4695(arg0, arg2);
        int var5 = arg1.method8250();
        this.field3061 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class244 var7 = new class244();
            try {
                var7.method4621(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3061.add(var7);
        }
        int var9 = arg1.method8250();
        this.field3063 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class252 var11 = new class252();
            try {
                var11.method4926(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3063.add(var11);
        }
        this.method5026(arg1, arg3);
    }

    @ObfuscatedName("kk.cg(Lsg;ZI)V")
    public void method5026(class489 arg0, boolean arg1) {
        this.field3060 = new LinkedList();
        int var3 = arg0.method8250();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8300();
            class308 var6 = new class308(arg0.method8254());
            boolean var7 = arg0.method8248() == 1;
            if (arg1 || !var7) {
                this.field3060.add(new class255((class308) null, var6, var5, (class262) null));
            }
        }
    }
}
