package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ad")
public class class45 extends class33 {

    @ObfuscatedName("ad.i")
    public HashSet field589;

    @ObfuscatedName("ad.s")
    public HashSet field588;

    @ObfuscatedName("ad.r")
    public List field586;

    @ObfuscatedName("ad.ch(Lfb;Lfb;Lfb;IZB)V")
    public void method572(class175 arg0, class175 arg1, class175 arg2, int arg3, boolean arg4) {
        this.method258(arg0, arg3);
        int var6 = arg2.method3023();
        this.field589 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method160(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field589.add(var8);
        }
        int var10 = arg2.method3023();
        this.field588 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method587(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field588.add(var12);
        }
        this.method575(arg1, arg4);
    }

    @ObfuscatedName("ad.cn(Lfb;ZI)V")
    public void method575(class175 arg0, boolean arg1) {
        this.field586 = new LinkedList();
        int var3 = arg0.method3023();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2918();
            class214 var6 = new class214(arg0.method2908());
            boolean var7 = arg0.method2903() == 1;
            if (arg1 || !var7) {
                this.field586.add(new class26(var5, var6));
            }
        }
    }
}
