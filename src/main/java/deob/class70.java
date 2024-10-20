package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bi")
public class class70 extends class57 {

    @ObfuscatedName("bi.l")
    public AudioFormat field1271;

    @ObfuscatedName("bi.e")
    public SourceDataLine field1269;

    @ObfuscatedName("bi.au")
    public int field1270;

    @ObfuscatedName("bi.ao")
    public byte[] field1272;

    @ObfuscatedName("bi.l(Ljava/awt/Component;)V")
    public void method1113(Component arg0) {
        this.field1271 = new AudioFormat((float) Statics.field1167, 16, Statics.field1946 ? 2 : 1, true, false);
        this.field1272 = new byte[0x100 << (Statics.field1946 ? 2 : 1)];
    }

    @ObfuscatedName("bi.e(I)V")
    public void method1120(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1271, arg0 << (Statics.field1946 ? 2 : 1));
            this.field1269 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1269.open();
            this.field1269.start();
            this.field1270 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1269 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method1120(var17);
        }
    }

    @ObfuscatedName("bi.q()I")
    public int method1115() {
        return this.field1270 - (this.field1269.available() >> (Statics.field1946 ? 2 : 1));
    }

    @ObfuscatedName("bi.o()V")
    public void method1116() {
        int var1 = 256;
        if (Statics.field1946) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1163[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1272[var2 * 2] = (byte) (var3 >> 8);
            this.field1272[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1269.write(this.field1272, 0, var1 << 1);
    }

    @ObfuscatedName("bi.g()V")
    public void method1117() {
        if (this.field1269 != null) {
            this.field1269.close();
            this.field1269 = null;
        }
    }

    @ObfuscatedName("bi.m()V")
    public void method1128() {
        this.field1269.flush();
    }
}
