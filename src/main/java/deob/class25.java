package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("h")
public class class25 {

    @ObfuscatedName("h.e")
    public int field406;

    @ObfuscatedName("h.i")
    public byte[] field402 = new byte[4];

    @ObfuscatedName("h.k")
    public class80 field397;

    @ObfuscatedName("h.q")
    public DataInputStream field396;

    @ObfuscatedName("h.j")
    public int field400;

    @ObfuscatedName("h.z")
    public byte[] field409;

    @ObfuscatedName("h.m")
    public int field398;

    @ObfuscatedName("h.w")
    public long field403;

    public class25(class75 arg0, URL arg1) {
        this.field397 = arg0.method1548(arg1);
        this.field406 = 0;
        this.field403 = class122.method37() + 30000L;
    }

    @ObfuscatedName("h.e(S)[B")
    public byte[] method248() throws IOException {
        if (class122.method37() > this.field403) {
            throw new IOException();
        }
        if (this.field406 == 0) {
            if (this.field397.field1413 == 2) {
                throw new IOException();
            }
            if (this.field397.field1413 == 1) {
                this.field396 = (DataInputStream) this.field397.field1417;
                this.field406 = 1;
            }
        }
        if (this.field406 == 1) {
            int var1 = this.field396.available();
            if (var1 > 0) {
                if (this.field400 + var1 > 4) {
                    var1 = 4 - this.field400;
                }
                this.field400 += this.field396.read(this.field402, this.field400, var1);
                if (this.field400 == 4) {
                    int var2 = (new class128(this.field402)).method2592();
                    this.field409 = new byte[var2];
                    this.field406 = 2;
                }
            }
        }
        if (this.field406 == 2) {
            int var3 = this.field396.available();
            if (var3 > 0) {
                if (this.field398 + var3 > this.field409.length) {
                    var3 = this.field409.length - this.field398;
                }
                this.field398 += this.field396.read(this.field409, this.field398, var3);
                if (this.field398 == this.field409.length) {
                    return this.field409;
                }
            }
        }
        return null;
    }
}
