package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aj")
public class class39 extends class27 {

    @ObfuscatedName("aj.r")
    public HashSet field332;

    @ObfuscatedName("aj.t")
    public HashSet field336;

    @ObfuscatedName("aj.l")
    public List field333;

    @ObfuscatedName("aj.ch(Lgx;Lgx;IZB)V")
    public void method586(class190 arg0, class190 arg1, int arg2, boolean arg3) {
        this.method348(arg0, arg2);
        int var5 = arg1.method3610();
        this.field332 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class16 var7 = new class16();
            try {
                var7.method167(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field332.add(var7);
        }
        int var9 = arg1.method3610();
        this.field336 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class40 var11 = new class40();
            try {
                var11.method598(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field336.add(var11);
        }
        this.method587(arg1, arg3);
    }

    @ObfuscatedName("aj.cg(Lgx;ZI)V")
    public void method587(class190 arg0, boolean arg1) {
        this.field333 = new LinkedList();
        int var3 = arg0.method3610();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3656();
            class235 var6 = new class235(arg0.method3460());
            boolean var7 = arg0.method3443() == 1;
            if (arg1 || !var7) {
                this.field333.add(new class19((class235) null, var6, var5, (class29) null));
            }
        }
    }
}
