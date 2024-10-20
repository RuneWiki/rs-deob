package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("by")
public class class70 extends class57 {

    @ObfuscatedName("by.s")
    public AudioFormat field1290;

    @ObfuscatedName("by.j")
    public SourceDataLine field1291;

    @ObfuscatedName("by.au")
    public int field1292;

    @ObfuscatedName("by.ap")
    public byte[] field1293;

    @ObfuscatedName("by.s(Ljava/awt/Component;)V")
    public void method1075(Component arg0) {
        this.field1290 = new AudioFormat((float) Statics.field1187, 16, Statics.field1181 ? 2 : 1, true, false);
        this.field1293 = new byte[0x100 << (Statics.field1181 ? 2 : 1)];
    }

    @ObfuscatedName("by.j(I)V")
    public void method1077(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1290, arg0 << (Statics.field1181 ? 2 : 1));
            this.field1291 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1291.open();
            this.field1291.start();
            this.field1292 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1291 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method1077(var17);
        }
    }

    @ObfuscatedName("by.p()I")
    public int method1083() {
        return this.field1292 - (this.field1291.available() >> (Statics.field1181 ? 2 : 1));
    }

    @ObfuscatedName("by.x()V")
    public void method1082() {
        int var1 = 256;
        if (Statics.field1181) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1201[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1293[var2 * 2] = (byte) (var3 >> 8);
            this.field1293[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1291.write(this.field1293, 0, var1 << 1);
    }

    @ObfuscatedName("by.d()V")
    public void method1078() {
        if (this.field1291 != null) {
            this.field1291.close();
            this.field1291 = null;
        }
    }

    @ObfuscatedName("by.u()V")
    public void method1079() {
        this.field1291.flush();
    }
}
