package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("eo")
public final class class135 implements Runnable {

    @ObfuscatedName("eo.e")
    public InputStream field2041;

    @ObfuscatedName("eo.a")
    public OutputStream field2033;

    @ObfuscatedName("eo.l")
    public Socket field2032;

    @ObfuscatedName("eo.c")
    public boolean field2045 = false;

    @ObfuscatedName("eo.u")
    public class128 field2036;

    @ObfuscatedName("eo.w")
    public class138 field2037;

    @ObfuscatedName("eo.i")
    public byte[] field2038;

    @ObfuscatedName("eo.r")
    public int field2039 = 0;

    @ObfuscatedName("eo.f")
    public int field2040 = 0;

    @ObfuscatedName("eo.g")
    public boolean field2034 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2036 = arg1;
        this.field2032 = arg0;
        this.field2032.setSoTimeout(30000);
        this.field2032.setTcpNoDelay(true);
        this.field2041 = this.field2032.getInputStream();
        this.field2033 = this.field2032.getOutputStream();
    }

    @ObfuscatedName("eo.c(B)V")
    public void method2659() {
        if (this.field2045) {
            return;
        }
        synchronized (this) {
            this.field2045 = true;
            this.notifyAll();
        }
        if (this.field2037 != null) {
            while (this.field2037.field2070 == 0) {
                class119.method837(1L);
            }
            if (this.field2037.field2070 == 1) {
                try {
                    ((Thread) this.field2037.field2074).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2037 = null;
    }

    public void finalize() {
        this.method2659();
    }

    @ObfuscatedName("eo.u(B)I")
    public int method2667() throws IOException {
        return this.field2045 ? 0 : this.field2041.read();
    }

    @ObfuscatedName("eo.w(S)I")
    public int method2661() throws IOException {
        return this.field2045 ? 0 : this.field2041.available();
    }

    @ObfuscatedName("eo.i([BIII)V")
    public void method2662(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2045) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2041.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("eo.r([BIII)V")
    public void method2663(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2045) {
            return;
        }
        if (this.field2034) {
            this.field2034 = false;
            throw new IOException();
        }
        if (this.field2038 == null) {
            this.field2038 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2038[this.field2040] = arg0[arg1 + var5];
                this.field2040 = (this.field2040 + 1) % 5000;
                if ((this.field2039 + 4900) % 5000 == this.field2040) {
                    throw new IOException();
                }
            }
            if (this.field2037 == null) {
                this.field2037 = this.field2036.method2566(this, 3);
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
                        if (this.field2040 == this.field2039) {
                            if (this.field2045) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2039;
                        if (this.field2040 >= this.field2039) {
                            var4 = this.field2040 - this.field2039;
                        } else {
                            var4 = 5000 - this.field2039;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2033.write(this.field2038, var3, var4);
                    } catch (IOException var12) {
                        this.field2034 = true;
                    }
                    this.field2039 = (this.field2039 + var4) % 5000;
                    try {
                        if (this.field2040 == this.field2039) {
                            this.field2033.flush();
                        }
                    } catch (IOException var11) {
                        this.field2034 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2041 != null) {
                        this.field2041.close();
                    }
                    if (this.field2033 != null) {
                        this.field2033.close();
                    }
                    if (this.field2032 != null) {
                        this.field2032.close();
                    }
                } catch (IOException var10) {
                }
                this.field2038 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method2555((String) null, var15);
        }
    }
}
