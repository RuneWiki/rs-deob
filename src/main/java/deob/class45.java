package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aq")
public class class45 extends class33 {

    @ObfuscatedName("aq.p")
    public HashSet field559;

    @ObfuscatedName("aq.w")
    public HashSet field554;

    @ObfuscatedName("aq.t")
    public List field555;

    @ObfuscatedName("aq.bl(Lgv;Lgv;Lgv;IZI)V")
    public void method541(class185 arg0, class185 arg1, class185 arg2, int arg3, boolean arg4) {
        this.method304(arg0, arg3);
        int var6 = arg2.method3015();
        this.field559 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method148(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field559.add(var8);
        }
        int var10 = arg2.method3015();
        this.field554 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method553(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field554.add(var12);
        }
        this.method542(arg1, arg4);
    }

    @ObfuscatedName("aq.bv(Lgv;ZB)V")
    public void method542(class185 arg0, boolean arg1) {
        this.field555 = new LinkedList();
        int var3 = arg0.method3015();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3200();
            class224 var6 = new class224(arg0.method3026());
            boolean var7 = arg0.method3021() == 1;
            if (arg1 || !var7) {
                this.field555.add(new class26(var5, var6));
            }
        }
    }
}
