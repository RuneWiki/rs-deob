package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("bf")
public class class70 extends class57 {

    @ObfuscatedName("bf.j")
    public AudioFormat field1269;

    @ObfuscatedName("bf.h")
    public SourceDataLine field1268;

    @ObfuscatedName("bf.am")
    public int field1267;

    @ObfuscatedName("bf.an")
    public byte[] field1270;

    @ObfuscatedName("bf.j(Ljava/awt/Component;)V")
    public void method1117(Component arg0) {
        this.field1269 = new AudioFormat((float) Statics.field1182, 16, Statics.field1945 ? 2 : 1, true, false);
        this.field1270 = new byte[0x100 << (Statics.field1945 ? 2 : 1)];
    }

    @ObfuscatedName("bf.h(I)V")
    public void method1097(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1269, arg0 << (Statics.field1945 ? 2 : 1));
            this.field1268 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1268.open();
            this.field1268.start();
            this.field1267 = arg0;
        } catch (LineUnavailableException var18) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1268 = null;
                throw var18;
            }
            int var11 = arg0 - 1;
            int var12 = var11 | var11 >>> 1;
            int var13 = var12 | var12 >>> 2;
            int var14 = var13 | var13 >>> 4;
            int var15 = var14 | var14 >>> 8;
            int var16 = var15 | var15 >>> 16;
            int var17 = var16 + 1;
            this.method1097(var17);
        }
    }

    @ObfuscatedName("bf.m()I")
    public int method1098() {
        return this.field1267 - (this.field1268.available() >> (Statics.field1945 ? 2 : 1));
    }

    @ObfuscatedName("bf.z()V")
    public void method1099() {
        int var1 = 256;
        if (Statics.field1945) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1162[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1270[var2 * 2] = (byte) (var3 >> 8);
            this.field1270[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1268.write(this.field1270, 0, var1 << 1);
    }

    @ObfuscatedName("bf.x()V")
    public void method1100() {
        if (this.field1268 != null) {
            this.field1268.close();
            this.field1268 = null;
        }
    }

    @ObfuscatedName("bf.e()V")
    public void method1101() {
        this.field1268.flush();
    }
}
