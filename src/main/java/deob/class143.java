package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ed")
public final class class143 implements Runnable {

    @ObfuscatedName("ed.n")
    public InputStream field2167;

    @ObfuscatedName("ed.q")
    public OutputStream field2163;

    @ObfuscatedName("ed.c")
    public Socket field2164;

    @ObfuscatedName("ed.l")
    public boolean field2165 = false;

    @ObfuscatedName("ed.r")
    public class136 field2172;

    @ObfuscatedName("ed.u")
    public class146 field2162;

    @ObfuscatedName("ed.j")
    public byte[] field2168;

    @ObfuscatedName("ed.w")
    public int field2169 = 0;

    @ObfuscatedName("ed.y")
    public int field2166 = 0;

    @ObfuscatedName("ed.o")
    public boolean field2171 = false;

    public class143(Socket arg0, class136 arg1) throws IOException {
        this.field2172 = arg1;
        this.field2164 = arg0;
        this.field2164.setSoTimeout(30000);
        this.field2164.setTcpNoDelay(true);
        this.field2164.setReceiveBufferSize(16384);
        this.field2164.setSendBufferSize(16384);
        this.field2167 = this.field2164.getInputStream();
        this.field2163 = this.field2164.getOutputStream();
    }

    @ObfuscatedName("ed.c(I)V")
    public void method2832() {
        if (this.field2165) {
            return;
        }
        synchronized (this) {
            this.field2165 = true;
            this.notifyAll();
        }
        if (this.field2162 != null) {
            while (this.field2162.field2200 == 0) {
                class127.method1567(1L);
            }
            if (this.field2162.field2200 == 1) {
                try {
                    ((Thread) this.field2162.field2204).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2162 = null;
    }

    public void finalize() {
        this.method2832();
    }

    @ObfuscatedName("ed.l(B)I")
    public int method2833() throws IOException {
        return this.field2165 ? 0 : this.field2167.read();
    }

    @ObfuscatedName("ed.r(B)I")
    public int method2841() throws IOException {
        return this.field2165 ? 0 : this.field2167.available();
    }

    @ObfuscatedName("ed.u([BIIS)V")
    public void method2843(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2165) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2167.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ed.j([BIII)V")
    public void method2838(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2165) {
            return;
        }
        if (this.field2171) {
            this.field2171 = false;
            throw new IOException();
        }
        if (this.field2168 == null) {
            this.field2168 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2168[this.field2166] = arg0[arg1 + var5];
                this.field2166 = (this.field2166 + 1) % 5000;
                if ((this.field2169 + 4900) % 5000 == this.field2166) {
                    throw new IOException();
                }
            }
            if (this.field2162 == null) {
                this.field2162 = this.field2172.method2713(this, 3);
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
                        if (this.field2169 == this.field2166) {
                            if (this.field2165) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2169;
                        if (this.field2166 >= this.field2169) {
                            var4 = this.field2166 - this.field2169;
                        } else {
                            var4 = 5000 - this.field2169;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2163.write(this.field2168, var3, var4);
                    } catch (IOException var12) {
                        this.field2171 = true;
                    }
                    this.field2169 = (this.field2169 + var4) % 5000;
                    try {
                        if (this.field2169 == this.field2166) {
                            this.field2163.flush();
                        }
                    } catch (IOException var11) {
                        this.field2171 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2167 != null) {
                        this.field2167.close();
                    }
                    if (this.field2163 != null) {
                        this.field2163.close();
                    }
                    if (this.field2164 != null) {
                        this.field2164.close();
                    }
                } catch (IOException var10) {
                }
                this.field2168 = null;
                break;
            }
        } catch (Exception var15) {
            class148.method2765((String) null, var15);
        }
    }
}
