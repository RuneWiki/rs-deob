package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ev")
public final class class134 implements Runnable {

    @ObfuscatedName("ev.p")
    public InputStream field2045;

    @ObfuscatedName("ev.y")
    public OutputStream field2046;

    @ObfuscatedName("ev.d")
    public Socket field2042;

    @ObfuscatedName("ev.c")
    public boolean field2043 = false;

    @ObfuscatedName("ev.r")
    public class127 field2049;

    @ObfuscatedName("ev.f")
    public class137 field2040;

    @ObfuscatedName("ev.z")
    public byte[] field2051;

    @ObfuscatedName("ev.o")
    public int field2047 = 0;

    @ObfuscatedName("ev.k")
    public int field2048 = 0;

    @ObfuscatedName("ev.s")
    public boolean field2041 = false;

    public class134(Socket arg0, class127 arg1) throws IOException {
        this.field2049 = arg1;
        this.field2042 = arg0;
        this.field2042.setSoTimeout(30000);
        this.field2042.setTcpNoDelay(true);
        this.field2045 = this.field2042.getInputStream();
        this.field2046 = this.field2042.getOutputStream();
    }

    @ObfuscatedName("ev.r(B)V")
    public void method2611() {
        if (this.field2043) {
            return;
        }
        synchronized (this) {
            this.field2043 = true;
            this.notifyAll();
        }
        if (this.field2040 != null) {
            while (this.field2040.field2074 == 0) {
                class118.method1901(1L);
            }
            if (this.field2040.field2074 == 1) {
                try {
                    ((Thread) this.field2040.field2078).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2040 = null;
    }

    public void finalize() {
        this.method2611();
    }

    @ObfuscatedName("ev.f(I)I")
    public int method2596() throws IOException {
        return this.field2043 ? 0 : this.field2045.read();
    }

    @ObfuscatedName("ev.z(B)I")
    public int method2597() throws IOException {
        return this.field2043 ? 0 : this.field2045.available();
    }

    @ObfuscatedName("ev.o([BIII)V")
    public void method2598(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2043) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2045.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ev.k([BIII)V")
    public void method2599(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2043) {
            return;
        }
        if (this.field2041) {
            this.field2041 = false;
            throw new IOException();
        }
        if (this.field2051 == null) {
            this.field2051 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2051[this.field2048] = arg0[arg1 + var5];
                this.field2048 = (this.field2048 + 1) % 5000;
                if ((this.field2047 + 4900) % 5000 == this.field2048) {
                    throw new IOException();
                }
            }
            if (this.field2040 == null) {
                this.field2040 = this.field2049.method2500(this, 3);
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
                        if (this.field2048 == this.field2047) {
                            if (this.field2043) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2047;
                        if (this.field2048 >= this.field2047) {
                            var4 = this.field2048 - this.field2047;
                        } else {
                            var4 = 5000 - this.field2047;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2046.write(this.field2051, var3, var4);
                    } catch (IOException var12) {
                        this.field2041 = true;
                    }
                    this.field2047 = (this.field2047 + var4) % 5000;
                    try {
                        if (this.field2048 == this.field2047) {
                            this.field2046.flush();
                        }
                    } catch (IOException var11) {
                        this.field2041 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2045 != null) {
                        this.field2045.close();
                    }
                    if (this.field2046 != null) {
                        this.field2046.close();
                    }
                    if (this.field2042 != null) {
                        this.field2042.close();
                    }
                } catch (IOException var10) {
                }
                this.field2051 = null;
                break;
            }
        } catch (Exception var15) {
            class139.method2074((String) null, var15);
        }
    }
}
