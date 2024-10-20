package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aw")
public class class34 extends class21 {

    @ObfuscatedName("aw.x")
    public HashSet field325;

    @ObfuscatedName("aw.v")
    public HashSet field328;

    @ObfuscatedName("aw.g")
    public List field324;

    @ObfuscatedName("aw.br(Lgm;Lgm;Lgm;IZI)V")
    public void method524(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.method218(arg0, arg3);
        int var6 = arg2.method3346();
        this.field325 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class11 var8 = new class11();
            try {
                var8.method95(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field325.add(var8);
        }
        int var10 = arg2.method3346();
        this.field328 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class35 var12 = new class35();
            try {
                var12.method534(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field328.add(var12);
        }
        this.method522(arg1, arg4);
    }

    @ObfuscatedName("aw.bh(Lgm;ZB)V")
    public void method522(class185 arg0, boolean arg1) {
        this.field324 = new LinkedList();
        int var3 = arg0.method3346();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3381();
            class229 var6 = new class229(arg0.method3432());
            boolean var7 = arg0.method3344() == 1;
            if (arg1 || !var7) {
                this.field324.add(new class14(var5, var6));
            }
        }
    }
}
