package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aj")
public class class48 extends class36 {

    @ObfuscatedName("aj.h")
    public HashSet field357;

    @ObfuscatedName("aj.a")
    public HashSet field351;

    @ObfuscatedName("aj.q")
    public List field352;

    @ObfuscatedName("aj.ce(Lkf;Lkf;IZB)V")
    public void method623(class310 arg0, class310 arg1, int arg2, boolean arg3) {
        this.method339(arg0, arg2);
        int var5 = arg1.method5195();
        this.field357 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class25 var7 = new class25();
            try {
                var7.method218(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field357.add(var7);
        }
        int var9 = arg1.method5195();
        this.field351 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class49 var11 = new class49();
            try {
                var11.method646(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field351.add(var11);
        }
        this.method624(arg1, arg3);
    }

    @ObfuscatedName("aj.cr(Lkf;ZS)V")
    public void method624(class310 arg0, boolean arg1) {
        this.field352 = new LinkedList();
        int var3 = arg0.method5195();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5210();
            class223 var6 = new class223(arg0.method5270());
            boolean var7 = arg0.method5193() == 1;
            if (arg1 || !var7) {
                this.field352.add(new class28((class223) null, var6, var5, (class38) null));
            }
        }
    }
}
