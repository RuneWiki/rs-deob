package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ad")
public class class48 extends class36 {

    @ObfuscatedName("ad.n")
    public HashSet field373;

    @ObfuscatedName("ad.u")
    public HashSet field371;

    @ObfuscatedName("ad.h")
    public List field372;

    @ObfuscatedName("ad.by(Lkb;Lkb;IZI)V")
    public void method644(class310 arg0, class310 arg1, int arg2, boolean arg3) {
        this.method399(arg0, arg2);
        int var5 = arg1.method5139();
        this.field373 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class25 var7 = new class25();
            try {
                var7.method234(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field373.add(var7);
        }
        int var9 = arg1.method5139();
        this.field371 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class49 var11 = new class49();
            try {
                var11.method669(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field371.add(var11);
        }
        this.method643(arg1, arg3);
    }

    @ObfuscatedName("ad.bj(Lkb;ZI)V")
    public void method643(class310 arg0, boolean arg1) {
        this.field372 = new LinkedList();
        int var3 = arg0.method5139();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5154();
            class223 var6 = new class223(arg0.method5142());
            boolean var7 = arg0.method5137() == 1;
            if (arg1 || !var7) {
                this.field372.add(new class28((class223) null, var6, var5, (class38) null));
            }
        }
    }
}
