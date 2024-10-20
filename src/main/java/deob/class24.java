package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("i")
public class class24 {

    @ObfuscatedName("i.x")
    public int field343;

    @ObfuscatedName("i.p")
    public class79 field352;

    @ObfuscatedName("i.k")
    public DataInputStream field341;

    @ObfuscatedName("i.a")
    public byte[] field342 = new byte[4];

    @ObfuscatedName("i.q")
    public int field345;

    @ObfuscatedName("i.j")
    public byte[] field346;

    @ObfuscatedName("i.v")
    public int field347;

    @ObfuscatedName("i.w")
    public long field348;

    public class24(class74 arg0, URL arg1) {
        this.field352 = arg0.method1464(arg1);
        this.field343 = 0;
        this.field348 = class121.method2636() + 30000L;
    }

    @ObfuscatedName("i.x(B)[B")
    public byte[] method208() throws IOException {
        if (class121.method2636() > this.field348) {
            throw new IOException();
        }
        if (this.field343 == 0) {
            if (this.field352.field1379 == 2) {
                throw new IOException();
            }
            if (this.field352.field1379 == 1) {
                this.field341 = (DataInputStream) this.field352.field1387;
                this.field343 = 1;
            }
        }
        if (this.field343 == 1) {
            int var1 = this.field341.available();
            if (var1 > 0) {
                if (this.field345 + var1 > 4) {
                    var1 = 4 - this.field345;
                }
                this.field345 += this.field341.read(this.field342, this.field345, var1);
                if (this.field345 == 4) {
                    int var2 = (new class127(this.field342)).method2415();
                    this.field346 = new byte[var2];
                    this.field343 = 2;
                }
            }
        }
        if (this.field343 == 2) {
            int var3 = this.field341.available();
            if (var3 > 0) {
                if (this.field347 + var3 > this.field346.length) {
                    var3 = this.field346.length - this.field347;
                }
                this.field347 += this.field341.read(this.field346, this.field347, var3);
                if (this.field347 == this.field346.length) {
                    return this.field346;
                }
            }
        }
        return null;
    }
}
