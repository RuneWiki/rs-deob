package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fl")
public final class class164 extends class160 implements Runnable {

    @ObfuscatedName("fl.p")
    public InputStream field2142;

    @ObfuscatedName("fl.i")
    public OutputStream field2143;

    @ObfuscatedName("fl.w")
    public Socket field2146;

    @ObfuscatedName("fl.s")
    public boolean field2145 = false;

    @ObfuscatedName("fl.j")
    public class157 field2144;

    @ObfuscatedName("fl.a")
    public class156 field2147;

    @ObfuscatedName("fl.t")
    public byte[] field2148;

    @ObfuscatedName("fl.r")
    public int field2149 = 0;

    @ObfuscatedName("fl.m")
    public int field2150 = 0;

    @ObfuscatedName("fl.h")
    public boolean field2151 = false;

    @ObfuscatedName("fl.o")
    public final int field2152;

    @ObfuscatedName("fl.x")
    public final int field2153;

    public class164(Socket arg0, class157 arg1, int arg2) throws IOException {
        this.field2144 = arg1;
        this.field2146 = arg0;
        this.field2152 = arg2;
        this.field2153 = arg2 - 100;
        this.field2146.setSoTimeout(30000);
        this.field2146.setTcpNoDelay(true);
        this.field2146.setReceiveBufferSize(65536);
        this.field2146.setSendBufferSize(65536);
        this.field2142 = this.field2146.getInputStream();
        this.field2143 = this.field2146.getOutputStream();
    }

    @ObfuscatedName("fl.a(I)V")
    public void method2897() {
        if (this.field2145) {
            return;
        }
        synchronized (this) {
            this.field2145 = true;
            this.notifyAll();
        }
        if (this.field2147 != null) {
            while (this.field2147.field2106 == 0) {
                class193.method4(1L);
            }
            if (this.field2147.field2106 == 1) {
                try {
                    ((Thread) this.field2147.field2111).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2147 = null;
    }

    public void finalize() {
        this.method2897();
    }

    @ObfuscatedName("fl.w(I)I")
    public int method2908() throws IOException {
        return this.field2145 ? 0 : this.field2142.read();
    }

    @ObfuscatedName("fl.i(B)I")
    public int method2893() throws IOException {
        return this.field2145 ? 0 : this.field2142.available();
    }

    @ObfuscatedName("fl.p(II)Z")
    public boolean method2894(int arg0) throws IOException {
        if (this.field2145) {
            return false;
        }
        try {
            return this.field2142.available() >= arg0;
        } catch (IOException var3) {
            throw new IOException("Error reading from clientstream", var3);
        }
    }

    @ObfuscatedName("fl.s([BIII)I")
    public int method2901(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2145) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2142.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fl.aa([BIII)V")
    public void method2929(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2145) {
            return;
        }
        if (this.field2151) {
            this.field2151 = false;
            throw new IOException();
        }
        if (this.field2148 == null) {
            this.field2148 = new byte[this.field2152];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2148[this.field2150] = arg0[arg1 + var5];
                this.field2150 = (this.field2150 + 1) % this.field2152;
                if ((this.field2153 + this.field2149) % this.field2152 == this.field2150) {
                    throw new IOException();
                }
            }
            if (this.field2147 == null) {
                this.field2147 = this.field2144.method2873(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2150 == this.field2149) {
                            if (this.field2145) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2149;
                        if (this.field2150 >= this.field2149) {
                            var4 = this.field2150 - this.field2149;
                        } else {
                            var4 = this.field2152 - this.field2149;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2143.write(this.field2148, var3, var4);
                    } catch (IOException var12) {
                        this.field2151 = true;
                    }
                    this.field2149 = (this.field2149 + var4) % this.field2152;
                    try {
                        if (this.field2150 == this.field2149) {
                            this.field2143.flush();
                        }
                    } catch (IOException var11) {
                        this.field2151 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2142 != null) {
                        this.field2142.close();
                    }
                    if (this.field2143 != null) {
                        this.field2143.close();
                    }
                    if (this.field2146 != null) {
                        this.field2146.close();
                    }
                } catch (IOException var10) {
                }
                this.field2148 = null;
                break;
            }
        } catch (Exception var15) {
            class155.method1770((String) null, var15);
        }
    }

    @ObfuscatedName("fl.j([BIIB)V")
    public void method2896(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method2929(arg0, arg1, arg2);
    }
}
