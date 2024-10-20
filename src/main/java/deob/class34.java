package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("am")
public class class34 extends class21 {

    @ObfuscatedName("am.o")
    public HashSet field317;

    @ObfuscatedName("am.q")
    public HashSet field312;

    @ObfuscatedName("am.l")
    public List field313;

    @ObfuscatedName("am.cg(Lge;Lge;Lge;IZI)V")
    public void method525(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.method233(arg0, arg3);
        int var6 = arg2.method3280();
        this.field317 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class11 var8 = new class11();
            try {
                var8.method98(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field317.add(var8);
        }
        int var10 = arg2.method3280();
        this.field312 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class35 var12 = new class35();
            try {
                var12.method535(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field312.add(var12);
        }
        this.method520(arg1, arg4);
    }

    @ObfuscatedName("am.cb(Lge;ZI)V")
    public void method520(class185 arg0, boolean arg1) {
        this.field313 = new LinkedList();
        int var3 = arg0.method3280();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3284();
            class229 var6 = new class229(arg0.method3374());
            boolean var7 = arg0.method3299() == 1;
            if (arg1 || !var7) {
                this.field313.add(new class14(var5, var6));
            }
        }
    }
}
