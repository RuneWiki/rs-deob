package deob;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("at")
public class class39 extends class27 {

    @ObfuscatedName("at.x")
    public HashSet field334;

    @ObfuscatedName("at.r")
    public HashSet field331;

    @ObfuscatedName("at.v")
    public List field332;

    @ObfuscatedName("at.cy(Lkf;Lkf;IZB)V")
    public void method553(class301 arg0, class301 arg1, int arg2, boolean arg3) {
        this.method288(arg0, arg2);
        int var5 = arg1.method5069();
        this.field334 = new HashSet(var5);
        for (int var6 = 0; var6 < var5; var6++) {
            class16 var7 = new class16();
            try {
                var7.method146(arg1);
            } catch (IllegalStateException var14) {
                continue;
            }
            this.field334.add(var7);
        }
        int var9 = arg1.method5069();
        this.field331 = new HashSet(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class40 var11 = new class40();
            try {
                var11.method561(arg1);
            } catch (IllegalStateException var13) {
                continue;
            }
            this.field331.add(var11);
        }
        this.method557(arg1, arg3);
    }

    @ObfuscatedName("at.ct(Lkf;ZI)V")
    public void method557(class301 arg0, boolean arg1) {
        this.field332 = new LinkedList();
        int var3 = arg0.method5069();
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method5084();
            class214 var6 = new class214(arg0.method5072());
            boolean var7 = arg0.method5077() == 1;
            if (arg1 || !var7) {
                this.field332.add(new class19((class214) null, var6, var5, (class29) null));
            }
        }
    }
}
