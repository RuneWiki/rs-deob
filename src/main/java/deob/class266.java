package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("km")
public class class266 extends class245 {

    @ObfuscatedName("km.as")
    public HashSet field3023;

    @ObfuscatedName("km.ay")
    public HashSet field3022;

    @ObfuscatedName("km.am")
    public List field3021;

    @ObfuscatedName("km.cm(Lsy;Lsy;IZI)V")
    public void method4824(class478 arg0, class478 arg1, int arg2, boolean arg3) {
        this.method4493(arg0, arg2);
        int var5 = arg1.method7905();
        this.field3023 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class240 var7 = new class240();
            try {
                var7.method4402(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field3023.add(var7);
        }
        int var9 = arg1.method7905();
        this.field3022 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class248 var11 = new class248();
            try {
                var11.method4708(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field3022.add(var11);
        }
        this.method4825(arg1, arg3);
    }

    @ObfuscatedName("km.cw(Lsy;ZB)V")
    public void method4825(class478 arg0, boolean arg1) {
        this.field3021 = new LinkedList();
        int var3 = arg0.method7905();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method7922();
            class304 var6 = new class304(arg0.method7908());
            boolean var7 = arg0.method7909() == 1;
            if (arg1 || !var7) {
                this.field3021.add(new class251((class304) null, var6, var5, (class258) null));
            }
        }
    }
}
