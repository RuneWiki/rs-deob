package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aj")
public class class34 extends class21 {

    @ObfuscatedName("aj.k")
    public HashSet field293;

    @ObfuscatedName("aj.m")
    public HashSet field292;

    @ObfuscatedName("aj.q")
    public List field294;

    @ObfuscatedName("aj.bp(Lgx;Lgx;Lgx;IZI)V")
    public void method528(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.method270(arg0, arg3);
        int var6 = arg2.method3325();
        this.field293 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class11 var8 = new class11();
            try {
                var8.method121(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field293.add(var8);
        }
        int var10 = arg2.method3325();
        this.field292 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class35 var12 = new class35();
            try {
                var12.method539(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field292.add(var12);
        }
        this.method531(arg1, arg4);
    }

    @ObfuscatedName("aj.bf(Lgx;ZB)V")
    public void method531(class185 arg0, boolean arg1) {
        this.field294 = new LinkedList();
        int var3 = arg0.method3325();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3340();
            class229 var6 = new class229(arg0.method3328());
            boolean var7 = arg0.method3323() == 1;
            if (arg1 || !var7) {
                this.field294.add(new class14(var5, var6));
            }
        }
    }
}
