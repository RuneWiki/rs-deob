package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("d")
public class class17 {

    @ObfuscatedName("d.e")
    public int field255;

    @ObfuscatedName("d.o")
    public class133 field259;

    @ObfuscatedName("d.y")
    public DataInputStream field254;

    @ObfuscatedName("d.b")
    public byte[] field257 = new byte[4];

    @ObfuscatedName("d.w")
    public int field252;

    @ObfuscatedName("d.r")
    public byte[] field261;

    @ObfuscatedName("d.l")
    public int field258;

    @ObfuscatedName("d.s")
    public long field256;

    public class17(class123 arg0, URL arg1) {
        this.field259 = arg0.method2416(arg1);
        this.field255 = 0;
        this.field256 = class103.method833() + 30000L;
    }

    @ObfuscatedName("d.e(I)[B")
    public byte[] method152() throws IOException {
        if (class103.method833() > this.field256) {
            throw new IOException();
        }
        if (this.field255 == 0) {
            if (this.field259.field2064 == 2) {
                throw new IOException();
            }
            if (this.field259.field2064 == 1) {
                this.field254 = (DataInputStream) this.field259.field2067;
                this.field255 = 1;
            }
        }
        if (this.field255 == 1) {
            int var1 = this.field254.available();
            if (var1 > 0) {
                if (this.field252 + var1 > 4) {
                    var1 = 4 - this.field252;
                }
                this.field252 += this.field254.read(this.field257, this.field252, var1);
                if (this.field252 == 4) {
                    int var2 = (new class107(this.field257)).method2207();
                    this.field261 = new byte[var2];
                    this.field255 = 2;
                }
            }
        }
        if (this.field255 == 2) {
            int var3 = this.field254.available();
            if (var3 > 0) {
                if (this.field258 + var3 > this.field261.length) {
                    var3 = this.field261.length - this.field258;
                }
                this.field258 += this.field254.read(this.field261, this.field258, var3);
                if (this.field258 == this.field261.length) {
                    return this.field261;
                }
            }
        }
        return null;
    }
}
