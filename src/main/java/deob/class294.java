package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ln")
public class class294 extends class273 {

    @ObfuscatedName("ln.ax")
    public HashSet field3163;

    @ObfuscatedName("ln.ar")
    public HashSet field3164;

    @ObfuscatedName("ln.aj")
    public List field3165;

    @ObfuscatedName("ln.dl(Lur;Lur;IZB)V")
    public void method5236(class535 arg0, class535 arg1, int arg2, boolean arg3) {
        this.method4882(arg0, arg2);
        int var5 = arg1.method8670();
        this.field3163 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class268 var7 = new class268();
            try {
                var7.method4814(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3163.add(var7);
        }
        int var9 = arg1.method8670();
        this.field3164 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class276 var11 = new class276();
            try {
                var11.method5122(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3164.add(var11);
        }
        this.method5237(arg1, arg3);
    }

    @ObfuscatedName("ln.df(Lur;ZB)V")
    public void method5237(class535 arg0, boolean arg1) {
        this.field3165 = new LinkedList();
        int var3 = arg0.method8670();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8633();
            class339 var6 = new class339(arg0.method8682());
            boolean var7 = arg0.method8462() == 1;
            if (arg1 || !var7) {
                this.field3165.add(new class279((class339) null, var6, var5, (class286) null));
            }
        }
    }
}
