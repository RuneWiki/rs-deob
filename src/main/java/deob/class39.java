package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ae")
public class class39 extends class27 {

    @ObfuscatedName("ae.n")
    public HashSet field314;

    @ObfuscatedName("ae.i")
    public HashSet field317;

    @ObfuscatedName("ae.a")
    public List field316;

    @ObfuscatedName("ae.ce(Lgr;Lgr;IZI)V")
    public void method584(class202 arg0, class202 arg1, int arg2, boolean arg3) {
        this.method324(arg0, arg2);
        int var5 = arg1.method3530();
        this.field314 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class16 var7 = new class16();
            try {
                var7.method156(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field314.add(var7);
        }
        int var9 = arg1.method3530();
        this.field317 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class40 var11 = new class40();
            try {
                var11.method601(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field317.add(var11);
        }
        this.method583(arg1, arg3);
    }

    @ObfuscatedName("ae.cy(Lgr;ZB)V")
    public void method583(class202 arg0, boolean arg1) {
        this.field316 = new LinkedList();
        int var3 = arg0.method3530();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3434();
            class225 var6 = new class225(arg0.method3620());
            boolean var7 = arg0.method3551() == 1;
            if (arg1 || !var7) {
                this.field316.add(new class19((class225) null, var6, var5, (class29) null));
            }
        }
    }
}
