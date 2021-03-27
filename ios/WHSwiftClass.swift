//
//  File.swift
//  TwillioTesting
//
//  Created by Apple on 16/03/21.
//

import Foundation
import UIKit

//import IGListDiffKit

@objc(WHSwiftClass)
class WHSwiftClass: NSObject {
  
  
  override init() {
  
  }
  
  @objc
  func printMeNow(_ paramValue:String, callback:RCTResponseSenderBlock) {
    debugPrint("Value = \(paramValue)")
    TwillioInterface.shared.accessToken = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiIsImN0eSI6InR3aWxpby1mcGE7dj0xIn0.eyJqdGkiOiJTSzU0ODdlYjA5NTllODEzYTZiZGFkNDU0ZTIwMDU2MDk3LTE2MTU5MTQ3MDgiLCJpc3MiOiJTSzU0ODdlYjA5NTllODEzYTZiZGFkNDU0ZTIwMDU2MDk3Iiwic3ViIjoiQUNiMzM1ZTgxYzY3ZGEzMjMwOGFkMTg3MDBlMDExOWFjYyIsImV4cCI6MTYxNTkxODMwOCwiZ3JhbnRzIjp7ImlkZW50aXR5IjoiYWJoaWplZXR1cGFkaHlheSIsInZpZGVvIjp7fX19.AoX6SernbQjujl3w7WbnVjUhPs3J1IlK9aj8XKx4xqk"
    
    TwillioInterface.shared.roomName = "React Native"
    
    DispatchQueue.main.async {
      TwillioInterface.shared.launchTwillio(window: UIApplication.shared.windows.first(where: { $0.isKeyWindow }))
      TwillioInterface.shared.startTwilllio()
    }
    
    callback([true])
  }
  
  @objc
  static func requiresMainQueueSetup() -> Bool {
    return true
  }
}
