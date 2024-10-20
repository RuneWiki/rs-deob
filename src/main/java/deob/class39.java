package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("aq")
public class class39 extends class27 {

    @ObfuscatedName("aq.o")
    public HashSet field333;

    @ObfuscatedName("aq.e")
    public HashSet field330;

    @ObfuscatedName("aq.n")
    public List field332;

    @ObfuscatedName("aq.be(Lkg;Lkg;IZI)V")
    public void method578(class300 arg0, class300 arg1, int arg2, boolean arg3) {
        this.method336(arg0, arg2);
        int var5 = arg1.method5337();
        this.field333 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class16 var7 = new class16();
            try {
                var7.method163(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field333.add(var7);
        }
        int var9 = arg1.method5337();
        this.field330 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class40 var11 = new class40();
            try {
                var11.method611(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field330.add(var11);
        }
        this.method584(arg1, arg3);
    }

    @ObfuscatedName("aq.bt(Lkg;ZI)V")
    public void method584(class300 arg0, boolean arg1) {
        this.field332 = new LinkedList();
        int var3 = arg0.method5337();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5155();
            class214 var6 = new class214(arg0.method5277());
            boolean var7 = arg0.method5138() == 1;
            if (arg1 || !var7) {
                this.field332.add(new class19((class214) null, var6, var5, (class29) null));
            }
        }
    }
}
