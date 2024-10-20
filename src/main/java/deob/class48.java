package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("az")
public class class48 extends class36 {

    @ObfuscatedName("az.c")
    public HashSet field354;

    @ObfuscatedName("az.h")
    public HashSet field351;

    @ObfuscatedName("az.k")
    public List field353;

    @ObfuscatedName("az.bs(Lkn;Lkn;IZI)V")
    public void method612(class310 arg0, class310 arg1, int arg2, boolean arg3) {
        this.method327(arg0, arg2);
        int var5 = arg1.method5283();
        this.field354 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class25 var7 = new class25();
            try {
                var7.method215(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field354.add(var7);
        }
        int var9 = arg1.method5283();
        this.field351 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class49 var11 = new class49();
            try {
                var11.method625(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field351.add(var11);
        }
        this.method613(arg1, arg3);
    }

    @ObfuscatedName("az.by(Lkn;ZI)V")
    public void method613(class310 arg0, boolean arg1) {
        this.field353 = new LinkedList();
        int var3 = arg0.method5283();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5353();
            class223 var6 = new class223(arg0.method5209());
            boolean var7 = arg0.method5227() == 1;
            if (arg1 || !var7) {
                this.field353.add(new class28((class223) null, var6, var5, (class38) null));
            }
        }
    }
}
