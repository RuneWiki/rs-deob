package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("gi")
public class class189 extends class168 {

    @ObfuscatedName("gi.h")
    public HashSet field2125;

    @ObfuscatedName("gi.k")
    public HashSet field2123;

    @ObfuscatedName("gi.a")
    public List field2124;

    @ObfuscatedName("gi.bn(Lnv;Lnv;IZB)V")
    public void method3303(class385 arg0, class385 arg1, int arg2, boolean arg3) {
        this.method2970(arg0, arg2);
        int var5 = arg1.method6053();
        this.field2125 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class163 var7 = new class163();
            try {
                var7.method2894(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field2125.add(var7);
        }
        int var9 = arg1.method6053();
        this.field2123 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class171 var11 = new class171();
            try {
                var11.method3192(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field2123.add(var11);
        }
        this.method3301(arg1, arg3);
    }

    @ObfuscatedName("gi.bb(Lnv;ZI)V")
    public void method3301(class385 arg0, boolean arg1) {
        this.field2124 = new LinkedList();
        int var3 = arg0.method6053();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5975();
            class245 var6 = new class245(arg0.method6182());
            boolean var7 = arg0.method5958() == 1;
            if (arg1 || !var7) {
                this.field2124.add(new class174((class245) null, var6, var5, (class181) null));
            }
        }
    }
}
