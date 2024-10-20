package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ai")
public class class45 extends class33 {

    @ObfuscatedName("ai.y")
    public HashSet field555;

    @ObfuscatedName("ai.w")
    public HashSet field559;

    @ObfuscatedName("ai.k")
    public List field557;

    @ObfuscatedName("ai.cz(Lfv;Lfv;Lfv;IZI)V")
    public void method587(class181 arg0, class181 arg1, class181 arg2, int arg3, boolean arg4) {
        this.method331(arg0, arg3);
        int var6 = arg2.method3009();
        this.field555 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method168(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field555.add(var8);
        }
        int var10 = arg2.method3009();
        this.field559 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method601(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field559.add(var12);
        }
        this.method588(arg1, arg4);
    }

    @ObfuscatedName("ai.ci(Lfv;ZB)V")
    public void method588(class181 arg0, boolean arg1) {
        this.field557 = new LinkedList();
        int var3 = arg0.method3009();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3028();
            class220 var6 = new class220(arg0.method3017());
            boolean var7 = arg0.method3012() == 1;
            if (arg1 || !var7) {
                this.field557.add(new class26(var5, var6));
            }
        }
    }
}
