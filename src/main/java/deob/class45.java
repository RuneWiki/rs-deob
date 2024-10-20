package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("an")
public class class45 extends class33 {

    @ObfuscatedName("an.t")
    public HashSet field590;

    @ObfuscatedName("an.y")
    public HashSet field595;

    @ObfuscatedName("an.v")
    public List field591;

    @ObfuscatedName("an.ca(Lfp;Lfp;Lfp;IZS)V")
    public void method567(class175 arg0, class175 arg1, class175 arg2, int arg3, boolean arg4) {
        this.method276(arg0, arg3);
        int var6 = arg2.method2995();
        this.field590 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method175(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field590.add(var8);
        }
        int var10 = arg2.method2995();
        this.field595 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method582(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field595.add(var12);
        }
        this.method568(arg1, arg4);
    }

    @ObfuscatedName("an.cw(Lfp;ZS)V")
    public void method568(class175 arg0, boolean arg1) {
        this.field591 = new LinkedList();
        int var3 = arg0.method2995();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3009();
            class214 var6 = new class214(arg0.method2998());
            boolean var7 = arg0.method2999() == 1;
            if (arg1 || !var7) {
                this.field591.add(new class26(var5, var6));
            }
        }
    }
}
