package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("an")
public class class39 extends class27 {

    @ObfuscatedName("an.o")
    public HashSet field313;

    @ObfuscatedName("an.a")
    public HashSet field311;

    @ObfuscatedName("an.e")
    public List field310;

    @ObfuscatedName("an.cs(Lkl;Lkl;IZI)V")
    public void method585(class300 arg0, class300 arg1, int arg2, boolean arg3) {
        this.method288(arg0, arg2);
        int var5 = arg1.method4992();
        this.field313 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class16 var7 = new class16();
            try {
                var7.method164(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field313.add(var7);
        }
        int var9 = arg1.method4992();
        this.field311 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class40 var11 = new class40();
            try {
                var11.method593(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field311.add(var11);
        }
        this.method584(arg1, arg3);
    }

    @ObfuscatedName("an.cg(Lkl;ZI)V")
    public void method584(class300 arg0, boolean arg1) {
        this.field310 = new LinkedList();
        int var3 = arg0.method4992();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5001();
            class214 var6 = new class214(arg0.method5085());
            boolean var7 = arg0.method4990() == 1;
            if (arg1 || !var7) {
                this.field310.add(new class19((class214) null, var6, var5, (class29) null));
            }
        }
    }
}
