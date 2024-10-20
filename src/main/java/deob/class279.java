package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ko")
public class class279 extends class258 {

    @ObfuscatedName("ko.ah")
    public HashSet field3056;

    @ObfuscatedName("ko.ax")
    public HashSet field3054;

    @ObfuscatedName("ko.aa")
    public List field3055;

    @ObfuscatedName("ko.cv(Lty;Lty;IZB)V")
    public void method5057(class514 arg0, class514 arg1, int arg2, boolean arg3) {
        this.method4747(arg0, arg2);
        int var5 = arg1.method8246();
        this.field3056 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class253 var7 = new class253();
            try {
                var7.method4663(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3056.add(var7);
        }
        int var9 = arg1.method8246();
        this.field3054 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class261 var11 = new class261();
            try {
                var11.method4959(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3054.add(var11);
        }
        this.method5058(arg1, arg3);
    }

    @ObfuscatedName("ko.cc(Lty;ZB)V")
    public void method5058(class514 arg0, boolean arg1) {
        this.field3055 = new LinkedList();
        int var3 = arg0.method8246();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method8310();
            class324 var6 = new class324(arg0.method8496());
            boolean var7 = arg0.method8244() == 1;
            if (arg1 || !var7) {
                this.field3055.add(new class264((class324) null, var6, var5, (class271) null));
            }
        }
    }
}
