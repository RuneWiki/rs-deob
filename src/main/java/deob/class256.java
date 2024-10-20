package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("iw")
public class class256 extends class235 {

    @ObfuscatedName("iw.p")
    public HashSet field2957;

    @ObfuscatedName("iw.b")
    public HashSet field2959;

    @ObfuscatedName("iw.o")
    public List field2958;

    @ObfuscatedName("iw.ci(Lqr;Lqr;IZB)V")
    public void method4747(class464 arg0, class464 arg1, int arg2, boolean arg3) {
        this.method4407(arg0, arg2);
        int var5 = arg1.method7716();
        this.field2957 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class230 var7 = new class230();
            try {
                var7.method4301(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2957.add(var7);
        }
        int var9 = arg1.method7716();
        this.field2959 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class238 var11 = new class238();
            try {
                var11.method4637(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2959.add(var11);
        }
        this.method4748(arg1, arg3);
    }

    @ObfuscatedName("iw.cq(Lqr;ZB)V")
    public void method4748(class464 arg0, boolean arg1) {
        this.field2958 = new LinkedList();
        int var3 = arg0.method7716();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method7734();
            class294 var6 = new class294(arg0.method7720());
            boolean var7 = arg0.method7735() == 1;
            if (arg1 || !var7) {
                this.field2958.add(new class241((class294) null, var6, var5, (class248) null));
            }
        }
    }
}
