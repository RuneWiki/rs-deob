package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ix")
public class class222 {

    @ObfuscatedName("ix.ap")
    public Map field2372 = new HashMap();

    @ObfuscatedName("ix.af")
    public int field2373 = 0;

    @ObfuscatedName("ix.aj")
    public static final class222 field2374 = new class222();

    @ObfuscatedName("ry.am(I)Lix;")
    public static class222 method7757() {
        return field2374;
    }

    @ObfuscatedName("ix.ap(Lorg/json/JSONObject;ILeg;B)V")
    public void method4013(JSONObject arg0, int arg1, class113 arg2) {
        this.field2372.clear();
        JSONObject var4;
        try {
            var4 = arg0;
            this.field2373 = arg1;
            arg0.getLong("lastfullsyncat");
            arg0.getLong("lastcardupdatedat");
        } catch (Exception var8) {
            return;
        }
        try {
            this.method4019(var4.getJSONArray("crmcomponents"), this.field2373, arg2);
        } catch (Exception var7) {
        }
    }

    @ObfuscatedName("ix.af(Lorg/json/JSONArray;ILeg;B)V")
    public void method4019(JSONArray arg0, int arg1, class113 arg2) throws JSONException {
        if (arg0 == null) {
            return;
        }
        for (int var4 = 0; var4 < arg0.length(); var4++) {
            JSONObject var5 = arg0.getJSONObject(var4);
            if (var5.getString("game").equals("osrs") && !var5.getBoolean("removed")) {
                String var6 = var5.getString("platform");
                if (!var6.equals("mobile") && !var6.equals("android") && !var6.equals("ios")) {
                    class220 var7 = new class220();
                    try {
                        var7.method3981(var5, arg1, arg2);
                    } catch (Exception var10) {
                    }
                    if (!var7.field2357.isEmpty()) {
                        String var9 = var5.getString("location");
                        this.field2372.put(var9, var7);
                    }
                }
            }
        }
        this.field2372 = this.method4015();
        Statics.method2852();
    }

    @ObfuscatedName("ix.aj(S)Ljava/util/Map;")
    public Map method4015() {
        HashMap var1 = new HashMap();
        ArrayList var2 = new ArrayList();
        var2.addAll(this.field2372.entrySet());
        boolean var3 = false;
        while (!var3) {
            var3 = true;
            for (int var4 = 0; var4 < var2.size() - 1; var4++) {
                if (((class220) ((Entry) var2.get(var4)).getValue()).method3979() > ((class220) ((Entry) var2.get(var4 + 1)).getValue()).method3979()) {
                    Entry var5 = (Entry) var2.get(var4);
                    var2.set(var4, var2.get(var4 + 1));
                    var2.set(var4 + 1, var5);
                    var3 = false;
                }
            }
        }
        Iterator var6 = var2.iterator();
        while (var6.hasNext()) {
            Entry var7 = (Entry) var6.next();
            var1.put(var7.getKey(), var7.getValue());
        }
        return var1;
    }

    @ObfuscatedName("ix.aq(Ljava/lang/String;I)Lih;")
    public class220 method4016(String arg0) {
        return (class220) this.field2372.get(arg0);
    }
}
