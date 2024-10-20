package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ar")
public class class34 extends class21 {

    @ObfuscatedName("ar.w")
    public HashSet field307;

    @ObfuscatedName("ar.a")
    public HashSet field303;

    @ObfuscatedName("ar.z")
    public List field304;

    @ObfuscatedName("ar.bs(Lgx;Lgx;Lgx;IZI)V")
    public void method537(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.method258(arg0, arg3);
        int var6 = arg2.method3276();
        this.field307 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class11 var8 = new class11();
            try {
                var8.method118(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field307.add(var8);
        }
        int var10 = arg2.method3276();
        this.field303 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class35 var12 = new class35();
            try {
                var12.method546(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field303.add(var12);
        }
        this.method538(arg1, arg4);
    }

    @ObfuscatedName("ar.bc(Lgx;ZI)V")
    public void method538(class185 arg0, boolean arg1) {
        this.field304 = new LinkedList();
        int var3 = arg0.method3276();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3291();
            class229 var6 = new class229(arg0.method3279());
            boolean var7 = arg0.method3274() == 1;
            if (arg1 || !var7) {
                this.field304.add(new class14(var5, var6));
            }
        }
    }
}
