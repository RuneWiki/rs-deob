package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("at")
public class class45 extends class33 {

    @ObfuscatedName("at.g")
    public HashSet field567;

    @ObfuscatedName("at.k")
    public HashSet field566;

    @ObfuscatedName("at.t")
    public List field568;

    @ObfuscatedName("at.bu(Lfe;Lfe;Lfe;IZI)V")
    public void method543(class174 arg0, class174 arg1, class174 arg2, int arg3, boolean arg4) {
        this.method242(arg0, arg3);
        int var6 = arg2.method2873();
        this.field567 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method152(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field567.add(var8);
        }
        int var10 = arg2.method2873();
        this.field566 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method570(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field566.add(var12);
        }
        this.method542(arg1, arg4);
    }

    @ObfuscatedName("at.be(Lfe;ZI)V")
    public void method542(class174 arg0, boolean arg1) {
        this.field568 = new LinkedList();
        int var3 = arg0.method2873();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2954();
            class213 var6 = new class213(arg0.method2876());
            boolean var7 = arg0.method2871() == 1;
            if (arg1 || !var7) {
                this.field568.add(new class26(var5, var6));
            }
        }
    }
}
