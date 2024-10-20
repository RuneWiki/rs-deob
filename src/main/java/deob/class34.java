package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ao")
public class class34 extends class21 {

    @ObfuscatedName("ao.n")
    public HashSet field293;

    @ObfuscatedName("ao.f")
    public HashSet field292;

    @ObfuscatedName("ao.g")
    public List field291;

    @ObfuscatedName("ao.bb(Lgk;Lgk;Lgk;IZB)V")
    public void method491(class183 arg0, class183 arg1, class183 arg2, int arg3, boolean arg4) {
        this.method181(arg0, arg3);
        int var6 = arg2.method3253();
        this.field293 = new HashSet(var6);
        for (int var7 = 0; var7 < var6; var7++) {
            class11 var8 = new class11();
            try {
                var8.method96(arg1, arg2);
            } catch (IllegalStateException var15) {
                continue;
            }
            this.field293.add(var8);
        }
        int var10 = arg2.method3253();
        this.field292 = new HashSet(var10);
        for (int var11 = 0; var11 < var10; var11++) {
            class35 var12 = new class35();
            try {
                var12.method502(arg1, arg2);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field292.add(var12);
        }
        this.method492(arg1, arg4);
    }

    @ObfuscatedName("ao.bx(Lgk;ZI)V")
    public void method492(class183 arg0, boolean arg1) {
        this.field291 = new LinkedList();
        int var3 = arg0.method3253();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method3249();
            class227 var6 = new class227(arg0.method3374());
            boolean var7 = arg0.method3247() == 1;
            if (arg1 || !var7) {
                this.field291.add(new class14(var5, var6));
            }
        }
    }
}
