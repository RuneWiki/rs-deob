package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("e")
public class class17 {

    @ObfuscatedName("e.g")
    public int field233;

    @ObfuscatedName("e.s")
    public class133 field228;

    @ObfuscatedName("e.h")
    public DataInputStream field227;

    @ObfuscatedName("e.m")
    public byte[] field230 = new byte[4];

    @ObfuscatedName("e.u")
    public int field231;

    @ObfuscatedName("e.j")
    public byte[] field232;

    @ObfuscatedName("e.b")
    public int field236;

    @ObfuscatedName("e.v")
    public long field234;

    public class17(class123 arg0, URL arg1) {
        this.field228 = arg0.method2445(arg1);
        this.field233 = 0;
        this.field234 = class103.method494() + 30000L;
    }

    @ObfuscatedName("e.g(B)[B")
    public byte[] method170() throws IOException {
        if (class103.method494() > this.field234) {
            throw new IOException();
        }
        if (this.field233 == 0) {
            if (this.field228.field2051 == 2) {
                throw new IOException();
            }
            if (this.field228.field2051 == 1) {
                this.field227 = (DataInputStream) this.field228.field2057;
                this.field233 = 1;
            }
        }
        if (this.field233 == 1) {
            int var1 = this.field227.available();
            if (var1 > 0) {
                if (this.field231 + var1 > 4) {
                    var1 = 4 - this.field231;
                }
                this.field231 += this.field227.read(this.field230, this.field231, var1);
                if (this.field231 == 4) {
                    int var2 = (new class107(this.field230)).method2286();
                    this.field232 = new byte[var2];
                    this.field233 = 2;
                }
            }
        }
        if (this.field233 == 2) {
            int var3 = this.field227.available();
            if (var3 > 0) {
                if (this.field236 + var3 > this.field232.length) {
                    var3 = this.field232.length - this.field236;
                }
                this.field236 += this.field227.read(this.field232, this.field236, var3);
                if (this.field236 == this.field232.length) {
                    return this.field232;
                }
            }
        }
        return null;
    }
}
