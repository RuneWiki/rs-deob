package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("ba")
public class class73 extends class60 {

    @ObfuscatedName("ba.al")
    public AudioFormat field1343;

    @ObfuscatedName("ba.av")
    public SourceDataLine field1344;

    @ObfuscatedName("ba.ad")
    public int field1345;

    @ObfuscatedName("ba.at")
    public byte[] field1346;

    @ObfuscatedName("ba.l(Ljava/awt/Component;B)V")
    public void method1190(Component arg0) {
        this.field1343 = new AudioFormat((float) Statics.field1250, 16, Statics.field1239 ? 2 : 1, true, false);
        this.field1346 = new byte[0x100 << (Statics.field1239 ? 2 : 1)];
    }

    @ObfuscatedName("ba.b(II)V")
    public void method1191(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1343, arg0 << (Statics.field1239 ? 2 : 1));
            this.field1344 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1344.open();
            this.field1344.start();
            this.field1345 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1344 = null;
                throw var11;
            } else {
                this.method1191(class130.method940(arg0));
            }
        }
    }

    @ObfuscatedName("ba.g(I)I")
    public int method1192() {
        return this.field1345 - (this.field1344.available() >> (Statics.field1239 ? 2 : 1));
    }

    @ObfuscatedName("ba.e()V")
    public void method1193() {
        int var1 = 256;
        if (Statics.field1239) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1254[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1346[var2 * 2] = (byte) (var3 >> 8);
            this.field1346[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1344.write(this.field1346, 0, var1 << 1);
    }

    @ObfuscatedName("ba.p(B)V")
    public void method1181() {
        if (this.field1344 != null) {
            this.field1344.close();
            this.field1344 = null;
        }
    }

    @ObfuscatedName("ba.s(I)V")
    public void method1195() {
        this.field1344.flush();
    }
}
