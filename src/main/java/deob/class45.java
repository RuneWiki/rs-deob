package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ax")
public class class45 extends class33 {

    @ObfuscatedName("ax.z")
    public HashSet field582;

    @ObfuscatedName("ax.q")
    public HashSet field584;

    @ObfuscatedName("ax.j")
    public List field580;

    @ObfuscatedName("ax.cs(Lfx;Lfx;Lfx;IZB)V")
    public void method521(class174 arg0, class174 arg1, class174 arg2, int arg3, boolean arg4) {
        this.method242(arg0, arg3);
        int var6 = arg2.method2872();
        this.field582 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class23 var8 = new class23();
            try {
                var8.method135(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field582.add(var8);
        }
        int var10 = arg2.method2872();
        this.field584 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class46 var12 = new class46();
            try {
                var12.method528(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field584.add(var12);
        }
        this.method522(arg1, arg4);
    }

    @ObfuscatedName("ax.ce(Lfx;ZB)V")
    public void method522(class174 arg0, boolean arg1) {
        this.field580 = new LinkedList();
        int var3 = arg0.method2872();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method2885();
            class213 var6 = new class213(arg0.method2875());
            boolean var7 = arg0.method2870() == 1;
            if (arg1 || !var7) {
                this.field580.add(new class26(var5, var6));
            }
        }
    }
}
