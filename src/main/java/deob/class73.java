package deob;

import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

@ObfuscatedName("br")
public class class73 extends class60 {

    @ObfuscatedName("br.ay")
    public AudioFormat field1331;

    @ObfuscatedName("br.ah")
    public SourceDataLine field1333;

    @ObfuscatedName("br.ax")
    public int field1332;

    @ObfuscatedName("br.ar")
    public byte[] field1334;

    @ObfuscatedName("br.h(Ljava/awt/Component;B)V")
    public void method1209(Component arg0) {
        this.field1331 = new AudioFormat((float) Statics.field1236, 16, Statics.field1220 ? 2 : 1, true, false);
        this.field1334 = new byte[0x100 << (Statics.field1220 ? 2 : 1)];
    }

    @ObfuscatedName("br.i(II)V")
    public void method1222(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(SourceDataLine.class, this.field1331, arg0 << (Statics.field1220 ? 2 : 1));
            this.field1333 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1333.open();
            this.field1333.start();
            this.field1332 = arg0;
        } catch (LineUnavailableException var11) {
            int var5 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
            int var6 = (var5 >>> 2 & 0x33333333) + (var5 & 0x33333333);
            int var7 = (var6 >>> 4) + var6 & 0xF0F0F0F;
            int var8 = (var7 >>> 8) + var7;
            int var9 = (var8 >>> 16) + var8;
            int var10 = var9 & 0xFF;
            if (var10 == 1) {
                this.field1333 = null;
                throw var11;
            } else {
                this.method1222(class130.method1147(arg0));
            }
        }
    }

    @ObfuscatedName("br.u(B)I")
    public int method1207() {
        return this.field1332 - (this.field1333.available() >> (Statics.field1220 ? 2 : 1));
    }

    @ObfuscatedName("br.x()V")
    public void method1212() {
        int var1 = 256;
        if (Statics.field1220) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1224[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = 0x7FFFFF ^ var3 >> 31;
            }
            this.field1334[var2 * 2] = (byte) (var3 >> 8);
            this.field1334[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1333.write(this.field1334, 0, var1 << 1);
    }

    @ObfuscatedName("br.d(B)V")
    public void method1213() {
        if (this.field1333 != null) {
            this.field1333.close();
            this.field1333 = null;
        }
    }

    @ObfuscatedName("br.o(B)V")
    public void method1214() {
        this.field1333.flush();
    }
}
