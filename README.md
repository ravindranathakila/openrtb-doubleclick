Google DoubleClick Libraries
----------------------------------------------------------------------

This library supports RTB development for DoubleClick Ad Exchange
in Java. The doubleclick-core module includes DoubleClick's RTB model
and associated facilities such as crypto and metadata.  The second
module, doubleclick-openrtb, provides client-side mapping between
DoubleClick's model/protocol and OpenRTB, and validation support.

See our [wiki](https://github.com/google/openrtb-doubleclick/wiki)
to get started!
Use the Github issue tracker for bugs, RFEs or any support.


BUILDING NOTES
----------------------------------------------------------------------

You need: JDK 7, Maven 3.2, Protocol buffers (protoc) 2.5.0.
Building is supported from the command line with Maven and
from any IDE that can load Maven projects.

On Eclipse, the latest m2e is recommended but it can't run the code
generation step, so you need to run a "mvn install" from the command
line after checkout or after any mvn clean. Building with JDK 8 will
also not work, because we use the error-prone lint tool which is not
yet compatible with JDK 8 (once built, the library works with JDK 8).


RELEASE NOTES
----------------------------------------------------------------------

# Version 0.6.5, 18-08-2014

- Crypto reviews: javax.security's exceptions; initVector improvements;
  fix block cypher for >1 blocks; Price method names (millis/micros).
- Metadata: content-labels, publisher-verticals; better GeoTable parser.
- Mapper: Fix AdPosition & Banner.mimes; add Content.contentrating,
  User.data.segment, Banner.expdir, Video.startdelay (special values).
- DoubleClickValidator: validates dealId; optimizations.

# Version 0.6.4, 10-08-2014

* Remove dependency from apache-commons-codec!
* DoubleClickValidator improved (better logs) and refactored to not
  depend on OpenRTB; moved to the doubleclick-core module.
* Provide a DoubleClickMetadata.URLConnectionTransport.
* Added missing two methods in the mapper interface.
* DoubleClickCrypto.Price supports micros & currency unit.
* No need anymore to checkout the openrtb project for building.

# Version 0.6.3, 02-08-2014

* Update DoubleClick protocol to v51.
* Map User.gender/age from new UserDemographics data.
* Decrypt HyperlocalSet, keep in a link extension, and map Geo.lat/lon.
* Map Video.mimes and Video.companionad.mimes.
* DoubleClickCrypto: IDFA/Hyperlocal now correct; big general review.
* Fixed mapping of price and bidfloor properties to use currency units
  (which is the standard). Previous code used micros, that was a legacy
  from this code's DoubleClick roots, but was not OpenRTB-compliant.

# Version 0.6.2, 25-07-2014

* DoubleClickCrypto: optimize memory usage in Base64 encoding/decoding;
  some initial fixes for IDFA/Hyperlocal but still broken in some cases.
* Remove dependency on buggy, unsupported opencsv; using custom parser.
* DoubleClickOpenRtbMapper: Fix semi-transparent branded channels.

# Version 0.6.1, 15-07-2014

* Remove depedency from Guice! The libraries still supports all
  JSR-305 DI frameworks, but now only uses javax.inject.
* DoubleClick protocol v50; map app.content.userrating, app.name.
* Build system improvements (Maven, Eclipse, NetBeans).
* Improved OpenRtbSnippetProcessor handling of macro dependencies;
  see new documentation about this in OpenRtbMacros.

# Version 0.6, 10-07-2014

* Initial Open Source release.
